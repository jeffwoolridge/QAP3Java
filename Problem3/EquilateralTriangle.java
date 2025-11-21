public class EquilateralTriangle extends Triangle {
    
    /**
     * Constructor for EquilateralTriangle
     * @param side the length of each side
     */
    public EquilateralTriangle(double side) {
        super(side, side, side);
        this.name = "Equilateral Triangle";
    }
    
    /**
     * Set the side length for all three sides
     * @param side the new side length
     */
    public void setSide(double side) {
        this.side1 = side;
        this.side2 = side;
        this.side3 = side;
    }
    
    /**
     * Get the side length
     * @return the side length
     */
    public double getSide() {
        return side1;
    }
    
    /**
     * Calculate area of equilateral triangle
     * @return (√3 / 4) * side²
     */
    @Override
    public double getArea() {
        return (Math.sqrt(3) / 4) * side1 * side1;
    }
}
