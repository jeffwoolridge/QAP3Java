public class Demo {
    /**
     * Main method to test all shape classes
     */
    public static void main(String[] args) {
        System.out.println("===== ABSTRACT SHAPES DEMONSTRATION =====\n");
        
        // Create an array of Shape objects
        Shape[] shapes = new Shape[5];
        
        // Create different shape objects
        shapes[0] = new Circle(5);
        shapes[1] = new Ellipse(10, 6);
        shapes[2] = new Triangle(3, 4, 5);
        shapes[3] = new Triangle(5, 5, 8);
        shapes[4] = new EquilateralTriangle(4);
        
        // Display all shapes
        System.out.println("Shape Information:\n");
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
        
        System.out.println("\n===== END OF DEMONSTRATION =====");
    }
}