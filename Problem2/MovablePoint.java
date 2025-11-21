package Problem2;

/**
 * MovablePoint Class - Extends Point
 * Represents a point that can move with a velocity (xSpeed, ySpeed)
 */
public class MovablePoint extends Point {
    private float xSpeed;  // x component of velocity
    private float ySpeed;  // y component of velocity

    /**
     * Constructor for MovablePoint class
     * @param x the x coordinate
     * @param y the y coordinate
     * @param xSpeed the x component of velocity
     * @param ySpeed the y component of velocity
     */
    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    /**
     * Gets the x component of velocity
     * @return the x speed
     */
    public float getXSpeed() {
        return xSpeed;
    }

    /**
     * Sets the x component of velocity
     * @param xSpeed the new x speed
     */
    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    /**
     * Gets the y component of velocity
     * @return the y speed
     */
    public float getYSpeed() {
        return ySpeed;
    }

    /**
     * Sets the y component of velocity
     * @param ySpeed the new y speed
     */
    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    /**
     * Moves the point by updating its coordinates based on velocity
     * Note: x and y are private in Point, so we must use setters
     */
    public void move() {
        setX(getX() + xSpeed);
        setY(getY() + ySpeed);
    }

    /**
     * Returns a string representation of the MovablePoint
     * @return formatted string with point coordinates and velocity
     */
    @Override
    public String toString() {
        return super.toString() + ", Speed(" + xSpeed + ", " + ySpeed + ")";
    }
}