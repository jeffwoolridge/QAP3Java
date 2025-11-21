public abstract class Shape {
    protected String name;
    
    /**
     * Constructor for Shape
     * @param name the name of the shape
     */
    public Shape(String name) {
        this.name = name;
    }
    
    /**
     * Abstract method to calculate perimeter
     * @return the perimeter of the shape
     */
    public abstract double getPerimeter();
    
    /**
     * Abstract method to calculate area
     * @return the area of the shape
     */
    public abstract double getArea();
    
    /**
     * Get the name of the shape
     * @return the shape's name
     */
    public String getName() {
        return name;
    }
    
    /**
     * Set the name of the shape
     * @param name the new name
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Override toString to display shape information
     * @return formatted string with shape details
     */
    @Override
    public String toString() {
        return "Shape: " + name + ", Perimeter: " + String.format("%.4f", getPerimeter()) 
               + ", Area: " + String.format("%.4f", getArea());
    }
}