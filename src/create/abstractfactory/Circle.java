package create.abstractfactory;

/**
 * Created by Sun on 4/2/2017.
 */

public class Circle extends Shape {

    private float r;

    public Circle(float r) {
        this.r = r;
    }

    @Override
    public float calculateArea() {
        return r * r * 3.14f;
    }
}
