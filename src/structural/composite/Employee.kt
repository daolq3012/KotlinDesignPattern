package structural.composite

/**
 * Created by framgia on 05/07/2017.
 */
class Employee // constructor
(private val name: String, private val dept: String, private val salary: Int) {
  private val mSubordinates: MutableList<Employee>

  init {
    mSubordinates = ArrayList()
  }

  fun getSubordinates(): MutableList<Employee> {
    return mSubordinates
  }

  fun add(employee: Employee) {
    mSubordinates.add(employee)
  }

  fun remove(employee: Employee) {
    mSubordinates.remove(employee)
  }

  override fun toString(): String {
    return ("Employee :[ Name : $name, dept : $dept, salary :$salary ]")
  }
}