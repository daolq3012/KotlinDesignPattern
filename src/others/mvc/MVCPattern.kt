package others.mvc

import others.mvc.controller.StudentController
import others.mvc.model.Student
import others.mvc.view.StudentView

/**
 * Created by framgia on 11/07/2017.
 */
object MVCPattern {
    @JvmStatic fun main(args: Array<String>) {
        //fetch student record based on his roll no from the database
        val model = retriveStudentFromDatabase()

        //Create a view : to write student details on console
        val view = StudentView()

        val controller = StudentController(model, view)

        controller.updateView()

        print("\n")
        //update model data
        controller.setStudentName("John")

        controller.updateView()
    }

    private fun retriveStudentFromDatabase(): Student {
        val student = Student()
        student.name = "Robert"
        student.rollNo = "10"
        return student
    }
}
