package OOPSeminars;

import java.util.List;

public interface VendingMachine {
    public void initProduct(List<Product> productList);
    public Product getProduct(String name);


}
