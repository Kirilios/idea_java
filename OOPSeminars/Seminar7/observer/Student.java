package OOPSeminars.Seminar7.observer;

public class Student implements Observer{
    String name;
    int salary;

    public Student(String name){
        this.name = name;
        this.salary = 0;
    }
    @Override
    public void receiveOffer(String nameCompany, int salary) {

    }
}
