/**
 * Represents a ceiling with height and color.
 */
public class Ceiling {
    private int height;
    private int paintedColor;

    /**
     * Constructs a new Ceiling with the specified height and color.
     *
     * @param height the height of the ceiling
     * @param paintedColor the color of the ceiling
     */
    public Ceiling(int height, int paintedColor) {
        this.height = height;
        this.paintedColor = paintedColor;
    }

    public int getHeight() {
        return height;
    }

    public int getPaintedColor() {
        return paintedColor;
    }

    @Override
    public String toString() {
        return "Ceiling{" +
                "height=" + height +
                ", paintedColor=" + paintedColor +
                '}';
    }
}
