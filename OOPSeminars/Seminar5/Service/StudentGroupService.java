package OOPSeminars.Seminar5.Service;

import OOPSeminars.Seminar5.Data.Student;
import OOPSeminars.Seminar5.Data.StudentGroup;
import OOPSeminars.Seminar5.Data.Teacher;
import OOPSeminars.Seminar5.Data.User;

import java.util.ArrayList;
import java.util.List;


public class StudentGroupService {
    private List<StudentGroup> studentGroups;

    public StudentGroupService(List<StudentGroup> studentGroups) {
        this.studentGroups = new ArrayList<>(studentGroups);
    }

    public StudentGroup createStudentGroup(User teacher, List<User> studentList) {
        if (teacher == null || studentList == null) {
            System.out.println("некорректные данные для создания учебной группы.");
            return null;
        }

        if (!(teacher instanceof Teacher)) {
            System.out.println("пользователь не является преподавателем.");
            return null;
        }

        List<Student> students = new ArrayList<>();
        for (User user : studentList) {
            if (user instanceof Student) {
                students.add((Student) user);
            }
        }

        StudentGroup group = new StudentGroup((Teacher) teacher, students);
        studentGroups.add(group);
        return group;
    }

    public List<StudentGroup> getAllStudentGroups() {
        return studentGroups;
    }
}

