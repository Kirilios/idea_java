package OOPSeminars.Seminar4.controller;

import OOPSeminars.Seminar4.model.User;

public interface UserController <T extends User>{
    //Согласно принципу сегрегации интерфейсов, контроллер применяется только к классам наследникам User
    T create(String firstName, String secondName, String lastName);
}
