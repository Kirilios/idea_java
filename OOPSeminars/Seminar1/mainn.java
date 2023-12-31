package OOPSeminars.Seminar1;

import java.util.ArrayList;
import java.util.List;

public class mainn {
    public static void main(String[] args) {
        HotDrink hotdrink1 = new HotDrink("coffee", 200, 1.4, 60);
        HotDrink hotdrink2 = new HotDrink("mocco", 300, 1.2, 45);
        HotDrink hotdrink3 = new HotDrink("hotchocolate", 350, 1.1, 50);
        HotDrink hotdrink4 = new HotDrink("tea", 150, 1.5, 40);
        List<Product> productList = new ArrayList<>();
        productList.add(hotdrink1);
        productList.add(hotdrink2);
        productList.add(hotdrink3);
        productList.add(hotdrink4);
        HotDrinkVendingMachine vendingMachine = new HotDrinkVendingMachine();
        vendingMachine.initProduct(productList);
        System.out.println(vendingMachine.getProduct("tea"));
    }
}
