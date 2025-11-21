package Problem2;

/**
 * Point Class
 * Represents a point in 2D space with x and y coordinates
 */
public class Point {
    private float x;  // x coordinate
    private float y;  // y coordinate

    /**
     * Constructor for Point class
     * @param x the x coordinate
     * @param y the y coordinate
     */
    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Gets the x coordinate
     * @return the x coordinate
     */
    public float getX() {
        return x;
    }

    /**
     * Sets the x coordinate
     * @param x the new x coordinate
     */
    public void setX(float x) {
        this.x = x;
    }

    /**
     * Gets the y coordinate
     * @return the y coordinate
     */
    public float getY() {
        return y;
    }

    /**
     * Sets the y coordinate
     * @param y the new y coordinate
     */
    public void setY(float y) {
        this.y = y;
    }

    /**
     * Returns a string representation of the Point
     * @return formatted string with point coordinates
     */
    @Override
    public String toString() {
        return "Point(" + x + ", " + y + ")";
    }
}