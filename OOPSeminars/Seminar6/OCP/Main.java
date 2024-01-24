package OOPSeminars.Seminar6.OCP;

public class Main {
    public static void main(String[] args){
        Vehicle vehicle = new Vehicle(300, "Train");
        printMaxSpeed(vehicle);


    }
    public static void printMaxSpeed(Vehicle vehicle){
        System.out.println(vehicle.calculateMaxSpeed());
    }
}
