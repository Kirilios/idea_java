package OOPSeminars.Seminar2;

public class Main {
    public static void main(String[] args){
        Human human1 = new Human("Hagrid");
        Human human2 = new Human("Papich");
        Human human3 = new Human("Thor");
        Human human4 = new Human("Kuzma");
        Human human5 = new Human("Lobster");
        Market market = new Market();
        market.acceptToMarket(human1);
        market.acceptToMarket(human2);
        market.update();
        market.acceptToMarket(human3);
        market.acceptToMarket(human4);
        market.acceptToMarket(human5);
        market.update();
        market.acceptToMarket(human4);
        market.update();
    }
}
