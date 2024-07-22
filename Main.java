import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Main class to run the room management application.
 */
public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());
    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Room> rooms = new ArrayList<>();

    public static void main(String[] args) {
        boolean quit = false;
        while (!quit) {
            printActions();
            System.out.println("\nEnter action: ");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("\nShutting down...");
                    quit = true;
                    break;
                case 1:
                    createRoom();
                    break;
                case 2:
                    addFurniture();
                    break;
                case 3:
                    removeFurniture();
                    break;
                case 4:
                    controlLamp();
                    break;
                case 5:
                    viewRoomDetails();
                    break;
                case 6:
                    listRooms();
                    break;
                default:
                    System.out.println("Invalid action. Please choose a valid option.");
                    break;
            }
        }
    }

    private static void createRoom() {
        System.out.println("Enter directions for the four walls (e.g., North, South, East, West):");
        Wall wall1 = new Wall(scanner.nextLine());
        Wall wall2 = new Wall(scanner.nextLine());
        Wall wall3 = new Wall(scanner.nextLine());
        Wall wall4 = new Wall(scanner.nextLine());

        System.out.println("Enter ceiling height and painted color:");
        int height = scanner.nextInt();
        int color = scanner.nextInt();
        scanner.nextLine();
        Ceiling ceiling = new Ceiling(height, color);

        System.out.println("Enter lamp style, battery operated (true/false), and glob rating:");
        String style = scanner.nextLine();
        boolean battery = scanner.nextBoolean();
        int globRating = scanner.nextInt();
        scanner.nextLine();
        Lamp lamp = new Lamp(style, battery, globRating);

        Room room = new Room(wall1, wall2, wall3, wall4, ceiling, lamp);
        rooms.add(room);
        logger.log(Level.INFO, "Room created with walls: {0}, {1}, {2}, {3}, ceiling height: {4}, color: {5}, and lamp style: {6}", new Object[]{wall1.getDirection(), wall2.getDirection(), wall3.getDirection(), wall4.getDirection(), height, color, style});
    }

    private static void addFurniture() {
        System.out.println("Enter room number:");
        int roomNumber = scanner.nextInt();
        scanner.nextLine();
        if (roomNumber < 1 || roomNumber > rooms.size()) {
            System.out.println("Invalid room number.");
            return;
        }

        System.out.println("Enter furniture name, length, width, and height:");
        String name = scanner.nextLine();
        int length = scanner.nextInt();
        int width = scanner.nextInt();
        int height = scanner.nextInt();
        scanner.nextLine();
        Furniture furniture = new Furniture(name, length, width, height);
        rooms.get(roomNumber - 1).addFurniture(furniture);
        logger.log(Level.INFO, "Added furniture: {0} to room {1}", new Object[]{name, roomNumber});
    }

    private static void removeFurniture() {
        System.out.println("Enter room number:");
        int roomNumber = scanner.nextInt();
        scanner.nextLine();
        if (roomNumber < 1 || roomNumber > rooms.size()) {
            System.out.println("Invalid room number.");
            return;
        }

        System.out.println("Enter furniture name to remove:");
        String name = scanner.nextLine();
        Room room = rooms.get(roomNumber - 1);
        for (Furniture furniture : room.getFurnitureList()) {
            if (furniture.getName().equalsIgnoreCase(name)) {
                room.removeFurniture(furniture);
                logger.log(Level.INFO, "Removed furniture: {0} from room {1}", new Object[]{name, roomNumber});
                return;
            }
        }
        System.out.println("Furniture not found.");
    }

    private static void controlLamp() {
        System.out.println("Enter room number:");
        int roomNumber = scanner.nextInt();
        scanner.nextLine();
        if (roomNumber < 1 || roomNumber > rooms.size()) {
            System.out.println("Invalid room number.");
            return;
        }

        Room room = rooms.get(roomNumber - 1);
        System.out.println("Enter action (on/off):");
        String action = scanner.nextLine();
        if (action.equalsIgnoreCase("on")) {
            room.turnOnLamp();
        } else if (action.equalsIgnoreCase("off")) {
            room.turnOffLamp();
        } else {
            System.out.println("Invalid action.");
        }
    }

    private static void viewRoomDetails() {
        System.out.println("Enter room number:");
        int roomNumber = scanner.nextInt();
        scanner.nextLine();
        if (roomNumber < 1 || roomNumber > rooms.size()) {
            System.out.println("Invalid room number.");
            return;
        }

        Room room = rooms.get(roomNumber - 1);
        room.displayRoomDetails();
    }

    private static void listRooms() {
        System.out.println("Listing all rooms:");
        for (int i = 0; i < rooms.size(); i++) {
            System.out.println("Room " + (i + 1));
            rooms.get(i).displayRoomDetails();
        }
    }

    private static void printActions() {
        System.out.println("\nAvailable actions:\nPress");
        System.out.println("0 - to shutdown\n" +
                           "1 - to create a new room\n" +
                           "2 - to add furniture to a room\n" +
                           "3 - to remove furniture from a room\n" +
                           "4 - to control the lamp in a room\n" +
                           "5 - to view room details\n" +
                           "6 - to list all rooms\n" +
                           "Choose your action: ");
    }
}
