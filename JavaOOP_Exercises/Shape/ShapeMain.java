package Shape;

public class ShapeMain {
    public static void main(String[] args) {
        Shape rect = new Rectangle(5, 10);
        System.out.println("Rectangle Area: " + rect.getArea());
        System.out.println("Rectangle Perimeter: " + rect.getPerimeter());
        
        Shape circ = new Circle(7);
        System.out.println("Circle Area: " + circ.getArea());
        System.out.println("Circle Circumference: " + circ.getPerimeter());
        
        Shape tri = new Triangle(3, 4, 3, 4, 5);
        System.out.println("Triangle Area: " + tri.getArea());
        System.out.println("Triangle Perimeter: " + tri.getPerimeter());
    }
}
