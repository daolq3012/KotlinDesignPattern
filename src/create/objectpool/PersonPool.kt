package create.objectpool

import create.builder.Person

import java.util.Random

/**
 * Created by Sun on 4/2/2017.
 */

class PersonPool : Pool<Person>() {
    override fun create(): Person {
        return Person.Builder().widthName("daolq")
                .widthAddress("Phu Loc 9")
                .widthAge(Random().nextInt(100))
                .build()
    }
}
