package com.fstyle.java_design_pattern.structural.composite

/**
 * Created by framgia on 05/07/2017.
 */
object Composite {

  @JvmStatic fun main(args: Array<String>) {
    val CEO: Employee = Employee("Join", "CEO", 30000)

    val headSales = Employee("Robert", "Head Sales", 20000)

    val headMarketing = Employee("Michel", "Head Maketing", 20000)

    val salesExecutive1 = Employee("Richard", "Sales", 10000)
    val salesExecutive2 = Employee("Rob", "Sales", 10000)

    val clerk1 = Employee("laura", "marketing", 10000)
    val clerk2 = Employee("DaoLQ", "marketing", 10000)

    CEO.add(headSales)
    CEO.add(headMarketing)

    headSales.add(salesExecutive1)
    headSales.add(salesExecutive2)

    headMarketing.add(clerk1)
    headMarketing.add(clerk2)

    println(CEO)
    CEO.getSubordinates().forEach({ headEmployee ->
      run {
        println(headEmployee)
        headEmployee.getSubordinates().forEach(
            { employee -> println(employee) })
      }
    })
  }
}