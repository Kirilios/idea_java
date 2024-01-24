package OOPSeminars.Seminar5;

import OOPSeminars.Seminar5.Data.StudentGroup;
import OOPSeminars.Seminar5.Data.User;
import OOPSeminars.Seminar5.Service.StudentGroupService;
import OOPSeminars.Seminar5.View.StudentGroupView;
import OOPSeminars.Seminar5.controller.Controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<StudentGroup> studentGroups = new ArrayList<>();
        StudentGroupService studentGroupService = new StudentGroupService(List.of());
        Controller controller = new Controller(studentGroupService);

        User teacher1 = controller.formStudentGroup("RON", "Bo", "Dun",
                Arrays.asList("Alice", "Boo", "Tun"),
                Arrays.asList("ACe", "Fo", "Y"),
                Arrays.asList("R", "T", "S"));
        User teacher2 = controller.formStudentGroup("ne", "D", "liams",
                Arrays.asList("David", "Eva", "Frank"),
                Arrays.asList("W", "Tor", "Mr"),
                Arrays.asList("D", "E", "F"));
        StudentGroupView studentGroupView = new StudentGroupView();
        List<StudentGroup> allStudentGroups = studentGroupService.getAllStudentGroups();
        for (StudentGroup group : allStudentGroups) {
            studentGroupView.printOnConsoleGroup(group);
            System.out.println("------------------------------");
        }
    }

    }

