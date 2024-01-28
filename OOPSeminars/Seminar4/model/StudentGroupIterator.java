package OOPSeminars.Seminar4.model;

import OOPSeminars.Seminar4.model.Student;
import OOPSeminars.Seminar4.model.StudentGroup;

import java.util.Iterator;
import java.util.List;

public class StudentGroupIterator implements Iterator<Student> {
    //поля приватные, что соотвествует принципу инкапсуляции
    private List<Student> studentList;
    private int counter;

    public StudentGroupIterator(List<Student> studentList) {
        this.studentList = studentList;
        counter = 0;
        // раньше этот класс зависел больше от конкретного класса StudentGroup, теперь на листе студентов, согласно DIP
    }

    @Override
    public boolean hasNext() {
        return counter < studentList.size();
    }

    @Override
    public Student next() {
        if(hasNext()){
            return studentList.get(counter++);
        }
        return null;
    }

    @Override
    public void remove() {
        if(hasNext())
            studentList.remove(counter);
    }
}
