/**
 * Represents a wall with a direction.
 */
public class Wall {
    private String direction;

    /**
     * Constructs a new Wall with the specified direction.
     *
     * @param direction the direction of the wall
     */
    public Wall(String direction) {
        this.direction = direction;
    }

    public String getDirection() {
        return direction;
    }

    @Override
    public String toString() {
        return "Wall{" +
                "direction='" + direction + '\'' +
                '}';
    }
}
