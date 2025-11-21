// Test class for all shapes and scaling
public class Demo {

    // Static method to scale all shapes
    public static void scaleAll(Shape[] arr, double factor) {
        for (Shape s : arr) {
            s.scale(factor);
        }
    }

    public static void main(String[] args) {
        // Create array of shapes
        Shape[] shapes = new Shape[5];
        shapes[0] = new Circle(5);
        shapes[1] = new Ellipse(10, 4);
        shapes[2] = new Triangle(3, 4, 5);
        shapes[3] = new EquilateralTriangle(6);
        shapes[4] = new Ellipse(7, 7); // acts like a circle

        // Print original shapes
        System.out.println("=== Original Shapes ===");
        for (Shape s : shapes) {
            System.out.println(s);
        }

        // Scale all shapes by 2
        scaleAll(shapes, 2.0);

        // Print shapes after scaling
        System.out.println("\n=== Shapes After Scaling by 2 ===");
        for (Shape s : shapes) {
            System.out.println(s);
        }
    }
}
