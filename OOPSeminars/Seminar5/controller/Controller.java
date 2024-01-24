package OOPSeminars.Seminar5.controller;

import OOPSeminars.Seminar5.Data.*;
import OOPSeminars.Seminar5.Service.DataService;
import OOPSeminars.Seminar5.Service.StudentGroupService;
import OOPSeminars.Seminar5.View.StudentGroupView;
import OOPSeminars.Seminar5.View.StudentView;

import java.util.List;

public class Controller {
    private final DataService service = new DataService();
    private final StudentView studentView = new StudentView();

    private StudentGroupService studentGroupService;

    private final StudentGroupView studentGroupView = new StudentGroupView();

    public Controller(StudentGroupService studentGroupService){
        this.studentGroupService = studentGroupService;
    }

    public User formStudentGroup(String teacherFirstName, String teacherSecondName, String teacherLastName,
                                 List<String> studentFirstNames, List<String> studentSecondNames, List<String> studentLastNames)
    {
        User teacher = service.create(teacherFirstName, teacherSecondName, teacherLastName, Type.valueOf("TEACHER"));
        if (teacher == null) {
            System.out.println("Ошибка: Не удалось создать преподавателя.");
            return null;
        }

        List<User> students = service.createStudents(studentFirstNames, studentSecondNames, studentLastNames);

        studentGroupService.createStudentGroup(teacher, students);

        return teacher;
    }

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



}
