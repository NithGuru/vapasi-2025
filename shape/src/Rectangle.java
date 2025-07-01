public class Rectangle extends Shape {
    double length;
    double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle() {
    }

    @Override
    double calculateArea() {
        return length * width;
    }

    @Override
    double calculatePerimeter() {
        return 2 * (length + width);
    }

    void setDimension(double l, double w) {
        this.length = l;
        this.width = w;
    }

    void setDimension(double l) {
        this.length = l;
        this.width = l;
    }
}
