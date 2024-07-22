import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Represents a room with walls, ceiling, and furniture.
 */
public class Room {
    private static final Logger logger = Logger.getLogger(Room.class.getName());
    private Wall wall1;
    private Wall wall2;
    private Wall wall3;
    private Wall wall4;
    private Ceiling ceiling;
    private ArrayList<Furniture> furnitureList;
    private Lamp lamp;

    /**
     * Constructs a new Room with the specified walls, ceiling, and lamp.
     *
     * @param wall1 the first wall
     * @param wall2 the second wall
     * @param wall3 the third wall
     * @param wall4 the fourth wall
     * @param ceiling the ceiling
     * @param lamp the lamp
     */
    public Room(Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling, Lamp lamp) {
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.ceiling = ceiling;
        this.lamp = lamp;
        this.furnitureList = new ArrayList<>();
    }

    public void addFurniture(Furniture furniture) {
        furnitureList.add(furniture);
        logger.log(Level.INFO, "Added furniture: {0}", furniture);
    }

    public void removeFurniture(Furniture furniture) {
        furnitureList.remove(furniture);
        logger.log(Level.INFO, "Removed furniture: {0}", furniture);
    }

    public void turnOnLamp() {
        lamp.turnOn();
        logger.log(Level.INFO, "Lamp turned on");
    }

    public void turnOffLamp() {
        lamp.turnOff();
        logger.log(Level.INFO, "Lamp turned off");
    }

    public ArrayList<Furniture> getFurnitureList() {
        return furnitureList;
    }

    public void displayRoomDetails() {
        System.out.println("Room Details:");
        System.out.println("Walls: " + wall1.getDirection() + ", " + wall2.getDirection() + ", " + wall3.getDirection() + ", " + wall4.getDirection());
        System.out.println("Ceiling: Height = " + ceiling.getHeight() + ", Color = " + ceiling.getPaintedColor());
        System.out.println("Lamp: " + lamp.getStyle() + ", Battery operated: " + lamp.isBattery() + ", Glob rating: " + lamp.getGlobRating());
        System.out.println("Furniture:");
        for (Furniture furniture : furnitureList) {
            System.out.println(furniture);
        }
    }
}
