# Room Management System

## Overview

The Room Management System is a Java application designed to manage rooms and their components, including walls, ceilings, furniture, and lamps. It provides a user-friendly interface to create and manage rooms, add or remove furniture, and control lighting.

## Features

- **Room Management**: Create and manage rooms with walls, ceilings, and lamps.
- **Furniture Management**: Add and remove different types of furniture to/from rooms.
- **Lighting Control**: Control lamps in all rooms.
- **Room Details**: Display detailed information about each room and its furniture.
- **User Interface**: Console-based interactive interface for easy management.
- **Logging**: Logging functionality for better debugging and monitoring.

## How to Use

1. **Start the Application**: Run the `Main` class to start the application.
2. **Create Rooms**: Follow the prompts to create a room with walls, ceiling, and lamp.
3. **Manage Furniture**: Use the menu options to add or remove furniture in rooms.
4. **Control Lamps**: Turn lamps on or off in rooms.
5. **View Room Details**: Use the menu to view detailed information about rooms and their furniture.
6. **List All Rooms**: List all created rooms with their details.

## Getting Started

### Prerequisites

- Java Development Kit (JDK) installed on your computer.

### Installation

1. Clone the repository or download the source code.
2. Open the project in your preferred Java IDE (e.g., IntelliJ IDEA, Eclipse).
3. Ensure the JDK is correctly set up in your IDE.

### Running the Application

1. Compile and run the `Main` class.
2. Follow the on-screen instructions to interact with the application.

## Code Structure

- **Main.java**: Contains the main application logic and user interface.
- **Wall.java**: Defines the Wall class, representing a wall with a direction.
- **Bed.java**: Defines the Bed class, representing a bed with style and dimensions.
- **Ceiling.java**: Defines the Ceiling class, representing a ceiling with height and color.
- **Lamp.java**: Defines the Lamp class, representing a lamp with style, battery operation, and glob rating.
- **Furniture.java**: Defines the Furniture class, representing a piece of furniture with name and dimensions.
- **Room.java**: Defines the Room class, including methods for managing furniture and controlling lamps.

## Example Usage

1. Create a new room:
   ```java
   Wall wall1 = new Wall("North");
   Wall wall2 = new Wall("South");
   Wall wall3 = new Wall("East");
   Wall wall4 = new Wall("West");
   Ceiling ceiling = new Ceiling(10, 100);
   Lamp lamp = new Lamp("Modern", true, 75);
   Room room = new Room(wall1, wall2, wall3, wall4, ceiling, lamp);
