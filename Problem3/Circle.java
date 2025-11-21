public class Circle extends Shape {
    private double radius;
    
    /**
     * Constructor for Circle
     * @param radius the radius of the circle
     */
    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }
    
    /**
     * Get the radius of the circle
     * @return the radius
     */
    public double getRadius() {
        return radius;
    }
    
    /**
     * Set the radius of the circle
     * @param radius the new radius
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    /**
     * Scale the circle by the given factor (scales the radius).
     * @param factor the scale factor
     */
    public void scale(double factor) {
        this.radius *= factor;
    }
    
    /**
     * Calculate perimeter (circumference) of the circle
     * @return 2 * π * radius
     */
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    
    /**
     * Calculate area of the circle
     * @return π * radius²
     */
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
