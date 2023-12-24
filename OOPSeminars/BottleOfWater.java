package OOPSeminars;

public class BottleOfWater extends Product{
    private double volume;

    public BottleOfWater(String name, int cost, double volume) {
        super(name, cost);
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
    public String toString() {
        return "Product{" +
                "name='" + super.getName() + '\'' +
                ", cost=" + super.getCost() +
                ", volume=" + volume;
    }

}
