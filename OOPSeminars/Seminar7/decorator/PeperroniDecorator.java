package OOPSeminars.Seminar7.decorator;

public class PeperroniDecorator extends PizzaDecorator{
    public PeperroniDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", пеперони";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 60;
    }
}
