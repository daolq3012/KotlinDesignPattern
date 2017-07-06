package create.prototype;

/**
 * Created by Sun on 4/2/2017.
 */

public class PersonClone implements Cloneable {

    private String name;

    public PersonClone(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public PersonClone clone() throws CloneNotSupportedException {
        return (PersonClone) super.clone();
    }
}
