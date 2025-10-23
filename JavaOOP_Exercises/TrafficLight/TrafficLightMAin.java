package TrafficLight;

public class TrafficLightMAin {
    public static void main(String[] args) {
        TrafficLight tf = new TrafficLight("red", 30);

        System.out.println("Initial Color : " + tf.getColor());
        System.out.println("Initial Duration" + tf.getDuration());
        System.out.println("Is red :" + tf.isRed());
        System.out.println("Is Green : " + tf.isGreen());

        tf.setColor("Green");
        tf.setDuration(30);

        System.out.println("Initial Color : " + tf.getColor());
        System.out.println("Duration : " + tf.getDuration());
        System.out.println("Is red :" + tf.isRed());
        System.out.println("Is green :" + tf.isGreen());

        tf.changeColor("yellow");

        System.out.println("After change color : " + tf.getColor());
        System.out.println("Is red : " + tf.isRed());
        System.out.println("Is green : " + tf.isGreen());

    }
    
}
