import java.util.ArrayList;

public class ShapeMain {
    public static void main(String[] args) {

        Shape shape = new Circle(3);
        System.out.println("Circle: ");
        System.out.println("Area: " + shape.calculateArea());
        System.out.println("Perimeter :" + shape.calculatePerimeter());
        shape = new Rectangle(10, 20);
        System.out.println(" Rectangle: ");
        System.out.println("Area: " + shape.calculateArea());
        System.out.println("Perimeter: " + shape.calculatePerimeter());

        ArrayList<Shape> arrShape = new ArrayList<>();
        Shape circle = new Circle(7);
        arrShape.add(circle);
        Rectangle rectangle = new Rectangle();
        rectangle.setDimension(4, 6);
        arrShape.add(rectangle);
        Rectangle square = new Rectangle();
        square.setDimension(5);
        arrShape.add(square);
        Triangle triangle = new Triangle(5, 3, 4);
        arrShape.add(triangle);
        System.out.println("\n" + "From ArrayList :: ");
        for (Shape shape1 : arrShape) {
            System.out.println("Shape: " + shape1.getClass().getCanonicalName());
            System.out.println("Area: " + shape1.calculateArea());
            System.out.println("Perimeter " + shape1.calculatePerimeter());
            System.out.println();
        }
    }
}
