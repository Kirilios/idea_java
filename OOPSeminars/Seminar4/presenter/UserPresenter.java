package OOPSeminars.Seminar4.presenter;

import OOPSeminars.Seminar4.model.User;

import java.util.List;

public class UserPresenter<T extends User> {
    //сделал более абстрактным согласно DIP, чтобы можно было менять информацию
    public void printOnConsole(List<T> userList){
        for(T user : userList){
            System.out.println(user);
        }
    }
}
