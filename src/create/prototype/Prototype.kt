package create.prototype

/**
 * Created by framgia on 05/07/2017.
 */
object Prototype {

    @JvmStatic fun main(args: Array<String>) {
        var person = PersonClone("DaoLQ")
        print(person.name + " " + person.hashCode())
        person = person.clone()
        print("\n" + person.name + " " + person.hashCode() + "\n\n")
    }
}
