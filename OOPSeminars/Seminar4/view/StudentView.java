package OOPSeminars.Seminar4.view;

import OOPSeminars.Seminar4.model.Student;
import OOPSeminars.Seminar4.printer.UserPrinter;

import java.util.List;

public class StudentView implements UserView<Student> {
    private final UserPrinter<Student> presenter = new UserPrinter<>();

    @Override
    public void display(List<Student> list) {
        presenter.printOnConsole(list);
    }
}
