package OOPSeminars.Seminar4.service;

import OOPSeminars.Seminar4.comparator.UserComparator;
import OOPSeminars.Seminar4.model.Student;
import OOPSeminars.Seminar4.model.StudentGroup;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentGroupService {
    private final StudentGroup studentGroup;

    public StudentGroupService(StudentGroup studentGroup) {
        this.studentGroup = studentGroup;
    }

    public StudentGroup getStudentGroup() {
        return studentGroup;
    }

    public List<Student> getSortedStudentGroup(Comparator<Student> comparator){
        List<Student> studentList = new ArrayList<>(studentGroup.getStudentList());
        studentList.sort(comparator);
        return studentList;
        //Collections.sort(studentList);
        //улучшил метод добавив аргумент comparator, согласно SRP, чтобы пользователь сам мог сортировать по разным критериям
    }

    public List<Student> getSortedStudentGroupByFIO(){
        List<Student> studentList = new ArrayList<>(studentGroup.getStudentList());
        studentList.sort(new UserComparator());
        return studentList;
    }
}
