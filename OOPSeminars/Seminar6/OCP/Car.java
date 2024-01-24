package OOPSeminars.Seminar6.OCP;

public class Car extends Vehicle{
    public Car(int maxSpeed, String type) {
        super(maxSpeed, "Car");
    }

    @Override
    public double calculateMaxSpeed() {
        return super.calculateMaxSpeed() * 0.8;
    }
}
