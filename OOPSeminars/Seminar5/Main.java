package OOPSeminars.Seminar5;

import OOPSeminars.Seminar5.Service.StudentGroupServiceInterface;
import OOPSeminars.Seminar5.controller.Controller;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.createTeacher("Mark", "Lomov", "Komov");
        controller.createStudent("Ruslan", "Yin", "Mob");
        controller.createStudent("Rob", "Yun", "Horev");
        controller.createStudent("Dominic", "Lur", "Jameson");
        StudentGroupServiceInterface studentGroupService = new StudentGroupServiceInterface();
        studentGroupService.createStudentGroup(Teacher teacher, List)


    }
}
