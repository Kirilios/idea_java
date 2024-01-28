package OOPSeminars.Seminar4.controller;

import OOPSeminars.Seminar4.model.Student;

public class StudentController implements UserController<Student> {
    private final UserCreator<Student> studentCreator;

    public StudentController(UserCreator<Student> studentCreator) {
        this.studentCreator = studentCreator;
    }

    @Override
    public Student create(String firstName, String secondName, String lastName) {
        return studentCreator.createUser(firstName, secondName, lastName);
    }
}
