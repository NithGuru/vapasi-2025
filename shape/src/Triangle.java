public class Triangle extends Shape {
    double s1;
    double s2;
    double s3;

    public Triangle(double s1, double s2, double s3) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    @Override
    double calculateArea() {
        double semiP = calculatePerimeter() / (double) 2;
        return Math.sqrt(semiP * (semiP - s1) * (semiP - s2) * (semiP - s3));

    }

    @Override
    double calculatePerimeter() {
        return (s1 + s2 + s3);
    }
}
