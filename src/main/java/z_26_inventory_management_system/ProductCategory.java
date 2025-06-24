package z_26_inventory_management_system;

import java.util.ArrayList;
import java.util.List;

public class ProductCategory {

    int productCategoryId;
    String categoryName;
    List<Product> productList = new ArrayList<>();
    double price;

    public void addProduct(Product product) {
        productList.add(product);
    }

    public void removeProduct(int count) {
        for (int i = 1; i <= count; i++) {
            productList.remove(0);
        }
    }
}
