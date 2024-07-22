/**
 * Represents a piece of furniture with a name and dimensions.
 */
public class Furniture {
    private String name;
    private int length;
    private int width;
    private int height;

    /**
     * Constructs a new Furniture with the specified name and dimensions.
     *
     * @param name the name of the furniture
     * @param length the length of the furniture
     * @param width the width of the furniture
     * @param height the height of the furniture
     */
    public Furniture(String name, int length, int width, int height) {
        this.name = name;
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Furniture{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}
