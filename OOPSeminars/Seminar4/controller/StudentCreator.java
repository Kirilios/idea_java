package OOPSeminars.Seminar4.controller;

import OOPSeminars.Seminar4.model.Student;

public class StudentCreator implements UserCreator<Student>{
    @Override
    public Student createUser(String firstName, String secondName, String lastName) {
        return new Student(1, firstName, secondName, lastName);
    }
}
