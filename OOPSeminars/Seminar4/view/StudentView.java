package OOPSeminars.Seminar4.view;

import OOPSeminars.Seminar4.model.Student;
import OOPSeminars.Seminar4.presenter.UserPresenter;

import java.util.List;

public class StudentView implements UserView<Student> {
    private final UserPresenter<Student> presenter = new UserPresenter<>();

    @Override
    public void display(List<Student> list) {
        presenter.printOnConsole(list);
    }
}
