/**
 * Represents a lamp with style, battery operation, and glob rating.
 */
public class Lamp {
    private String style;
    private boolean battery;
    private int globRating;

    /**
     * Constructs a new Lamp with the specified style, battery operation, and glob rating.
     *
     * @param style the style of the lamp
     * @param battery whether the lamp is battery operated
     * @param globRating the glob rating of the lamp
     */
    public Lamp(String style, boolean battery, int globRating) {
        this.style = style;
        this.battery = battery;
        this.globRating = globRating;
    }

    public void turnOn() {
        System.out.println("The lamp is being turned on.");
    }

    public void turnOff() {
        System.out.println("The lamp is being turned off.");
    }

    public String getStyle() {
        return style;
    }

    public boolean isBattery() {
        return battery;
    }

    public int getGlobRating() {
        return globRating;
    }

    @Override
    public String toString() {
        return "Lamp{" +
                "style='" + style + '\'' +
                ", battery=" + battery +
                ", globRating=" + globRating +
                '}';
    }
}
