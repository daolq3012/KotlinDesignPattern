package others.mvc.controller

import others.mvc.model.Student
import others.mvc.view.StudentView

/**
 * Created by framgia on 11/07/2017.
 */
class StudentController(var model: Student, var view: StudentView) {

    fun setStudentName(name: String) {
        model.name = name
    }

    fun setStudentRollNo(roolNo: String) {
        model.rollNo = roolNo
    }

    fun getStudentRollNo(): String? {
        return model.rollNo
    }

    fun updateView() {
        view.printStudentDetails(model.name!!, model.rollNo!!)
    }
}
