package OOPSeminars.Seminar5.Service;

import OOPSeminars.Seminar5.Data.Student;
import OOPSeminars.Seminar5.Data.StudentGroup;
import OOPSeminars.Seminar5.Data.Teacher;

import java.util.List;

public class StudentGroupService implements StudentGroupServiceInterface {
    @Override
    public StudentGroup createStudentGroup(Teacher teacher, List<Student> studentList) {
        return new StudentGroup(teacher, studentList);
    }
}
//getAllStudentGroups
