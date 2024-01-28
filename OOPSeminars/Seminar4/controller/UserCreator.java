package OOPSeminars.Seminar4.controller;

import OOPSeminars.Seminar4.model.User;

public interface UserCreator <T extends User>{
    //StudentController и TeacherController теперь зависят от абстрактного интерфейса UserCreator
    T createUser(String firstName, String secondName, String lastName);
}
