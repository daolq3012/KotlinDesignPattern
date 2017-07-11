package others.mvc.view

/**
 * Created by framgia on 11/07/2017.
 */
class StudentView {
    fun printStudentDetails(studentName: String, studentRollNo: String) {
        print("Student: ")
        print("Name: $studentName\n")
        print("Roll No: " + studentRollNo)
    }
}
