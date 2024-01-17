package OOPSeminars.Seminar3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student>{
    private List<Student> studentList;
    private String groupName;

    public StudentGroup(List<Student> studentList) {
        this.studentList = studentList;
    }

    public StudentGroup(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }


    public void addStudent(Student student){
        studentList.add(student);
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(this);
    }
}
