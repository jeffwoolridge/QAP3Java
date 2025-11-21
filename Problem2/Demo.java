package Problem2;
/**
 * Demo Class for Problem 2 - Tests Point and MovablePoint classes
 */
public class Demo {
    /**
     * Main method - demonstrates Point and MovablePoint functionality
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        System.out.println("=== Problem 2: Point and MovablePoint ===\n");

        // Test Point class
        System.out.println("--- Testing Point Class ---");
        Point p1 = new Point(2.5f, 3.7f);
        System.out.println("Initial Point: " + p1);
        System.out.println("X coordinate: " + p1.getX());
        System.out.println("Y coordinate: " + p1.getY());
        
        p1.setX(5.0f);
        p1.setY(6.5f);
        System.out.println("After modification: " + p1);
        System.out.println();

        // Test MovablePoint class
        System.out.println("--- Testing MovablePoint Class ---");
        MovablePoint mp1 = new MovablePoint(1.0f, 2.0f, 0.5f, 0.75f);
        System.out.println("Initial MovablePoint: " + mp1);
        System.out.println("X Speed: " + mp1.getXSpeed());
        System.out.println("Y Speed: " + mp1.getYSpeed());
        System.out.println();

        // Test move method
        System.out.println("--- Testing Move Method ---");
        System.out.println("Before move: " + mp1);
        mp1.move();
        System.out.println("After 1 move: " + mp1);
        mp1.move();
        System.out.println("After 2 moves: " + mp1);
        mp1.move();
        System.out.println("After 3 moves: " + mp1);
        System.out.println();

        // Test with different speeds
        System.out.println("--- Testing with Different Speeds ---");
        MovablePoint mp2 = new MovablePoint(10.0f, 20.0f, 2.0f, 3.0f);
        System.out.println("Initial: " + mp2);
        
        for (int i = 1; i <= 3; i++) {
            mp2.move();
            System.out.println("After move " + i + ": " + mp2);
        }
        System.out.println();

        // Test setters for speed
        System.out.println("--- Testing Speed Setters ---");
        mp2.setXSpeed(1.0f);
        mp2.setYSpeed(1.5f);
        System.out.println("After changing speeds: " + mp2);
        mp2.move();
        System.out.println("After one move with new speeds: " + mp2);
    }
}