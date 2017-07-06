package create.factorymethod;

/**
 * Created by Sun on 4/2/2017.
 */

public class Rectangle implements Shape {

    private float length;
    private float width;

    public Rectangle(float high, float width) {
        this.length = high;
        this.width = width;
    }

    @Override
    public float calculateArea() {
        return length * width;
    }
}
