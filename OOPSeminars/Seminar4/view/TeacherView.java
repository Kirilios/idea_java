package OOPSeminars.Seminar4.view;

import OOPSeminars.Seminar4.model.Teacher;
import OOPSeminars.Seminar4.printer.UserPrinter;

import java.util.List;

public class TeacherView implements UserView<Teacher> {
    private final UserPrinter<Teacher> presenter = new UserPrinter<>();
    @Override
    public void display(List<Teacher> list) {
        presenter.printOnConsole(list);
    }
}

