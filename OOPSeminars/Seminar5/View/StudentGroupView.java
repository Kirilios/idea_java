package OOPSeminars.Seminar5.View;

import OOPSeminars.Seminar5.Data.Student;
import OOPSeminars.Seminar5.Data.StudentGroup;
import OOPSeminars.Seminar5.Data.Teacher;

import java.util.List;

public class StudentGroupView {
    public void printOnConsoleGroup(StudentGroup studentGroup){
        Teacher teacher = studentGroup.getTeacher();
        List<Student> studentList = studentGroup.getStudentsList();

        System.out.println("Group:");
        System.out.println("ID: " + teacher.getTeacherID() + ", Teacher: " + teacher.getFirstName() + teacher.getSecondName());
        System.out.println("Students:");

        for (Student student: studentList) {
            System.out.println("ID: " + student.getStudentID() + ", Student: " + student.getFirstName() + student.getSecondName());
        }

    }

}
