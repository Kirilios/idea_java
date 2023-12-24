package OOPSeminars;

import java.util.ArrayList;
import java.util.List;

public class mainn {
    public static void main(String[] args) {
//        BottleOfWater bottleOfWater = new BottleOfWater("test", 123, 1.5);
//        BottleOfWater bottleOfWater1 = new BottleOfWater("test1", 323, 0.5);
//        BottleOfWater bottleOfWater2 = new BottleOfWater("test2", 763, 1.5);
//        BottleOfWater bottleOfWater3 = new BottleOfWater("test3", 343, 2.5);
//        BottleOfWater bottleOfWater4 = new BottleOfWater("test4", 663, 1.5);
//        List<Product> productList = new ArrayList<>();
//        productList.add(bottleOfWater);
//        productList.add(bottleOfWater1);
//        productList.add(bottleOfWater2);
//        productList.add(bottleOfWater3);
//        productList.add(bottleOfWater4);
//        BottleOfWaterVendingMachine vendingMachine = new BottleOfWaterVendingMachine();
//        vendingMachine.initProduct(productList);
//        System.out.println(vendingMachine.getProduct("test"));
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
