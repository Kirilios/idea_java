package OOPSeminars;

import java.util.ArrayList;
import java.util.List;

class HotDrinkVendingMachine implements VendingMachine {
    private List<Product> productList = new ArrayList<>();
    @Override
    public void initProduct(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public Product getProduct(String name) {
        for (Product product : productList) {
            if (product.getName().equals(name)) return product;
        }
        return null;
    }
    public Product getProduct(String name, double volume, int temperature){
            for (Product product : productList) {
                if (product.getName().equals(name) && ((HotDrink)product).getVolume() == volume && ((HotDrink)product).getTemperature() == temperature)
                    return product;
            }
            return null;

    }
}
