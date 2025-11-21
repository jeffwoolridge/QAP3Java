// General triangle class
public class Triangle extends Shape {

    protected double side1, side2, side3;

    public Triangle(double s1, double s2, double s3) {
        super("Triangle");
        if (s1 + s2 <= s3 || s2 + s3 <= s1 || s3 + s1 <= s2) {
            System.out.println("Error: Invalid triangle side lengths.");
            System.exit(1);
        }
        side1 = s1;
        side2 = s2;
        side3 = s3;
    }

    @Override
    public double getPerimeter() { return side1 + side2 + side3; }

    @Override
    public double getArea() {
        double s = getPerimeter() / 2.0;
        return Math.sqrt(s * (s-side1) * (s-side2) * (s-side3));
    }

    @Override
    public void scale(double factor) {
        side1 *= factor;
        side2 *= factor;
        side3 *= factor;
    }
}
