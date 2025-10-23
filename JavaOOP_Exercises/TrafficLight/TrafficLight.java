package TrafficLight;

public class TrafficLight {
    private String color;
    private int duration;

    public TrafficLight(String color, int duration) {
        this.color = color;
        this.duration = duration;


    }
    public String getColor() {
        return color;
    }
    public int getDuration() {
        return duration;
    }

    public void setColor(String color) {
        this.color = color;

    }
    public void setDuration(int duration) {
        this.duration = duration;
    }
    public void changeColor(String newcolor) {
        this.color = newcolor;

    }
    public boolean isRed() {
        return "red".equalsIgnoreCase(color);

    }
    public boolean isGreen() {
        return "green".equalsIgnoreCase(color);
    }
}
