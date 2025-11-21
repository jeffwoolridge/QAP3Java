public class Ellipse extends Shape {
    private double a; // major axis
    private double b; // minor axis
    
    /**
     * Constructor for Ellipse
     * @param a first axis length
     * @param b second axis length
     */
    public Ellipse(double a, double b) {
        super("Ellipse");
        // Assign the largest value to a and smallest to b
        if (a >= b) {
            this.a = a;
            this.b = b;
        } else {
            this.a = b;
            this.b = a;
        }
    }
    
    /**
     * Get the major axis
     * @return major axis (a)
     */
    public double getA() {
        return a;
    }
    
    /**
     * Get the minor axis
     * @return minor axis (b)
     */
    public double getB() {
        return b;
    }
    
    /**
     * Set the major and minor axes
     * @param a first axis length
     * @param b second axis length
     */
    public void setAxes(double a, double b) {
        if (a >= b) {
            this.a = a;
            this.b = b;
        } else {
            this.a = b;
            this.b = a;
        }
    }
    
    /**
     * Scale the ellipse by the given factor (implements Scalable.scale)
     * @param factor scaling factor (must be positive)
     */

    public void scale(double factor) {
        if (factor <= 0) {
            throw new IllegalArgumentException("Scale factor must be positive");
        }
        this.a *= factor;
        this.b *= factor;
        // Ensure a remains the major axis
        if (this.a < this.b) {
            double tmp = this.a;
            this.a = this.b;
            this.b = tmp;
        }
    }
    
    /**
     * Calculate perimeter of the ellipse using Ramanujan's approximation
     * @return approximate perimeter
     */
    @Override
    public double getPerimeter() {
        double h = Math.pow((a - b) / (a + b), 2);
        return Math.PI * (a + b) * (1 + (3 * h) / (10 + Math.sqrt(4 - 3 * h)));
    }
    
    /**
     * Calculate area of the ellipse
     * @return π * a * b
     */
    @Override
    public double getArea() {
        return Math.PI * a * b;
    }
}
