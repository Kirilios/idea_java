package OOPSeminars.Seminar7.decorator;

public class mainDecorator {
    public static void main(String[] args) {
        Pizza pizza = new PeperroniDecorator(new CheeseDecorator(new CheeseDecorator(new PizzaDough())));
        System.out.println(pizza.getDescription() + " -> " + pizza.getCost());

    }
}
