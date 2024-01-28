package OOPSeminars.Seminar4.controller;


import OOPSeminars.Seminar4.model.Teacher;

public class TeacherCreator implements UserCreator<Teacher>{
    @Override
    public Teacher createUser(String firstName, String secondName, String lastName) {
        return new Teacher(firstName, secondName, lastName);
    }
}
