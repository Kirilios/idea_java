package OOPSeminars.Seminar5.Service;



import OOPSeminars.Seminar5.Data.*;

import java.util.List;

public interface StudentGroupServiceInterface {
    StudentGroup createStudentGroup(Teacher teacher, List<Student> studentList);

}
