package OOPSeminars.Seminar4.view;

import OOPSeminars.Seminar4.model.User;

import java.util.List;

public interface UserView <T extends User>{
    //согласно SRP данный интерфейс UserView имеет конкретные реализации для TEACHER и STUDENT
    //добавил абстрактный presenter чтобы там менять логику представления и печати
    //sendOnConsole поменял на display, чтобы он отображал список экземпляров, которые нужны
    void display(List<T> list);
}
