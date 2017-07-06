package create.objectpool;

import create.builder.Person;

import java.util.Random;

/**
 * Created by Sun on 4/2/2017.
 */

public class PersonPool extends Pool<Person> {
    @Override
    protected Person create() {
        return new Person.Builder().widthName("daolq")
                .widthAddress("Phu Loc 9")
                .widthAge(new Random().nextInt(100))
                .build();
    }
}
