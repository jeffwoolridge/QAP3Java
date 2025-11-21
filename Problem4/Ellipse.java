// Ellipse class with major axis 'a' and minor axis 'b'
public class Ellipse extends Shape {

    protected double a; // major axis
    protected double b; // minor axis

    public Ellipse(double x, double y) {
        super("Ellipse");
        if (x >= y) { a = x; b = y; } else { a = y; b = x; }
    }

    @Override
    public double getArea() { return Math.PI * a * b; }

    @Override
    public double getPerimeter() {
        return Math.PI * Math.sqrt(2 * (a*a + b*b) - ((a-b)*(a-b))/2.0);
    }

    @Override
    public void scale(double factor) {
        a *= factor;
        b *= factor;
    }
}
