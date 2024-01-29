package OOPSeminars.Seminar4.view;

import OOPSeminars.Seminar4.model.Teacher;
import OOPSeminars.Seminar4.presenter.UserPresenter;

import java.util.List;

public class TeacherView implements UserView<Teacher> {
    private final UserPresenter<Teacher> presenter = new UserPresenter<>();
    @Override
    public void display(List<Teacher> list) {
        presenter.printOnConsole(list);
    }
}

