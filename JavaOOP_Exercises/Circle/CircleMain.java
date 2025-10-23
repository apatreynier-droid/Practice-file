package Circle;

public class CircleMain {
    public static void main(String[] args) {
   
        Circle circle = new Circle(5);


        System.out.println("Initial Radius: " + circle.getRadius());
        System.out.println("Area: " + circle.getArea());
        System.out.println("Circumference: " + circle.getCircumference());

        circle.setRadius(7.5);

        System.out.println("\nAfter updating the radius:");
        System.out.println("New Radius: " + circle.getRadius());
        System.out.println("Area: " + circle.getArea());
        System.out.println("Circumference: " + circle.getCircumference());
    }
}
