package OOPSeminars.Seminar7.decorator;

public class PizzaDough implements Pizza{
    @Override
    public String getDescription() {
        return "Тесто";
    }

    @Override
    public double getCost() {
        return 150;
    }
}
