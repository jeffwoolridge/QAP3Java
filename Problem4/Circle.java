// Circle is a special case of Ellipse where a == b
public class Circle extends Ellipse {

    public Circle(double radius) {
        super(radius, radius);
        this.name = "Circle";
    }

    @Override
    public void scale(double factor) {
        a *= factor;
        b *= factor;
    }
}
