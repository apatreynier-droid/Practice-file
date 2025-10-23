package Rectangle;

public class RectangleMain {
    public static void main(String[] args) {

        Rectangle rect = new Rectangle(5, 10);

        
        System.out.println("Initial Width: " + rect.getWidth());
        System.out.println("Initial Height: " + rect.getHeight());
        System.out.println("Area: " + rect.getArea());
        System.out.println("Perimeter: " + rect.getPerimeter());

        rect.setWidth(8);
        rect.setHeight(12);


        System.out.println("\nAfter updating dimensions:");
        System.out.println("New Width: " + rect.getWidth());
        System.out.println("New Height: " + rect.getHeight());
        System.out.println("Area: " + rect.getArea());
        System.out.println("Perimeter: " + rect.getPerimeter());
    }
}
