package create.builder
/**
 * Created by framgia on 05/07/2017.
 */
object Builder {

  @JvmStatic fun main(args: Array<String>) {
    val person: Person = Person.Builder().widthName("DaoLQ").widthAddress("Phu Loc 9").widthAge(
        27).build()
    print(person.toString() + "\n\n")
  }
}