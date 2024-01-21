package OOPSeminars.Seminar5.Data;

import java.util.List;

public class StudentGroup {
    private Teacher teacher;
    private List<Student> studentList;

    public StudentGroup(Teacher teacher, List<Student> studentList){
        this.teacher = teacher;
        this.studentList = studentList;
    }

    public Teacher getTeacher(){
        return teacher;
    }

    public List<Student> getStudentsList() {
        return studentList;
    }
}
