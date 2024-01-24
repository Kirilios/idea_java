package OOPSeminars.Seminar6.DIP;

public class DieselEngine implements Engine{
    @Override
    public void start() {
        Engine.super.start();
        System.out.println("Disel engine started");
    }
}
