enum TrafficLight {
    RED(30),
    GREEN(45),
    YELLOW(5);

    int duration;

    TrafficLight(int duration) {
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }
}

public class Q4Enum {
    public static void main(String[] args) {
        for (TrafficLight light : TrafficLight.values()) {
            System.out.println("Light = " + light  + " ==>" + " Duration = " + light.getDuration() + " seconds");
        }
    }
}
