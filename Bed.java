/**
 * Represents a bed with style and dimensions.
 */
public class Bed {
    private String style;
    private int pillows;
    private int height;
    private int sheets;
    private int quilt;

    /**
     * Constructs a new Bed with the specified style and dimensions.
     *
     * @param style the style of the bed
     * @param pillows the number of pillows
     * @param height the height of the bed
     * @param sheets the number of sheets
     * @param quilt the number of quilts
     */
    public Bed(String style, int pillows, int height, int sheets, int quilt) {
        this.style = style;
        this.pillows = pillows;
        this.height = height;
        this.sheets = sheets;
        this.quilt = quilt;
    }

    public void make() {
        System.out.println("The bed is being made.");
    }

    public String getStyle() {
        return style;
    }

    public int getPillows() {
        return pillows;
    }

    public int getHeight() {
        return height;
    }

    public int getSheets() {
        return sheets;
    }

    public int getQuilt() {
        return quilt;
    }

    @Override
    public String toString() {
        return "Bed{" +
                "style='" + style + '\'' +
                ", pillows=" + pillows +
                ", height=" + height +
                ", sheets=" + sheets +
                ", quilt=" + quilt +
                '}';
    }
}
