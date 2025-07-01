public class Circle extends Shape {
    double radius;

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    double calculatePerimeter() {
        return Math.PI * 2 * radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }
}
