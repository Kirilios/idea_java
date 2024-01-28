package OOPSeminars.Seminar7.observer;

import java.util.Random;

public class Company {
    private final Publisher jobAgency;
    String nameCompany;

    int maxSalary;

    Random rnd;


    public Company(Publisher jobAgency, String nameCompany, int maxSalary) {
        this.jobAgency = jobAgency;
    }
    public void needEmployee(){
        jobAgency.sendOffer(nameCompany, maxSalary);
    }
}
