package OOPSeminars.Seminar6.OCP;

public class Bus extends Vehicle{

    public Bus(int maxSpeed, String type) {
        super(maxSpeed, "Bus");
    }

    @Override
    public double calculateMaxSpeed() {
        return super.calculateMaxSpeed() * 0.5;
    }
}
