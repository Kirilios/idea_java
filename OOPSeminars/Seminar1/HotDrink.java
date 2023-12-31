package OOPSeminars.Seminar1;

class HotDrink extends BottleOfWater{
   private int temperature;

   public HotDrink(String name, int cost, double volume, int temperature) {
        super(name, cost, volume);
        this.temperature = temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }
    public String toString() {
        return "Product{" +
                "name='" + super.getName() + '\'' +
                ", volume=" + super.getVolume() +
                ", temperature=" + temperature;
    }
}
