package OOPSeminars.Seminar5.controller;

import OOPSeminars.Seminar5.Data.*;
import OOPSeminars.Seminar5.Service.DataService;
import OOPSeminars.Seminar5.Service.StudentGroupService;
import OOPSeminars.Seminar5.Service.StudentGroupServiceInterface;
import OOPSeminars.Seminar5.View.StudentGroupView;
import OOPSeminars.Seminar5.View.StudentView;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private List<Teacher> teachers;
    private List<Student> studentList;
    private final DataService service = new DataService();
    private final StudentView studentView = new StudentView();

    private StudentGroupServiceInterface studentGroupService;

    private final StudentGroupView studentGroupView = new StudentGroupView();


    public void createStudent(String firstName, String secondName, String lastName){
        service.create(firstName,secondName,lastName, Type.STUDENT);
    }
    public void createTeacher(String firstName, String secondName, String lastName){
        service.create(firstName,secondName,lastName, Type.TEACHER);
    }
    public void getAllStudent(){
        List<User> studentList = service.getAllStudents();
        for (User user: studentList){
            studentView.printOnConsole((Student)user);
        }
    }

    public StudentGroup formStudentGroup(Teacher teacher, List<Student> studentList){
        return studentGroupService.createStudentGroup(teacher, studentList);

    }


}
