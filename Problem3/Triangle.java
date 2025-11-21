public class Triangle extends Shape {
    protected double side1;
    protected double side2;
    protected double side3;
    
    /**
     * Constructor for Triangle
     * @param side1 first side length
     * @param side2 second side length
     * @param side3 third side length
     */
    public Triangle(double side1, double side2, double side3) {
        super("Triangle");
        
        // Validate triangle inequality
        if (!(side1 + side2 > side3 && side2 + side3 > side1 && side3 + side1 > side2)) {
            System.out.println("Error: Invalid triangle sides! The sum of any two sides must be greater than the third.");
            System.exit(1);
        }
        
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    
    /**
     * Get side1
     * @return side1
     */
    public double getSide1() {
        return side1;
    }
    
    /**
     * Get side2
     * @return side2
     */
    public double getSide2() {
        return side2;
    }
    
    /**
     * Get side3
     * @return side3
     */
    public double getSide3() {
        return side3;
    }
    
    /**
     * Calculate perimeter of the triangle
     * @return sum of all sides
     */
    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }
    
    /**
     * Calculate area of the triangle using Heron's formula
     * @return the area
     */
    @Override
    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    /**
     * Scale the triangle by a positive factor by scaling all sides.
     * @param factor scale multiplier (must be > 0)
     */
    
    public void scale(double factor) {
        if (factor <= 0) {
            throw new IllegalArgumentException("Scale factor must be positive");
        }
        side1 *= factor;
        side2 *= factor;
        side3 *= factor;
    }
}