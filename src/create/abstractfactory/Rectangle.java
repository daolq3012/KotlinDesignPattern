package create.abstractfactory;

/**
 * Created by Sun on 4/2/2017.
 */

public class Rectangle extends Shape {

    private float length;
    private float width;

    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public float calculateArea() {
        return length * width;
    }
}
