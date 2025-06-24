package z_26_inventory_management_system;

import java.util.HashMap;
import java.util.Map;

public class Cart {

    public Map<Integer, Integer> productCategoryIdVsCountMap;

    public Cart() {
        this.productCategoryIdVsCountMap = new HashMap<>();
    }

    public void addItemInCart(int productCategoryId, int count) {
        if (productCategoryIdVsCountMap.containsKey(productCategoryId)) {
            int noOfItemsInCart = productCategoryIdVsCountMap.get(productCategoryId);
            productCategoryIdVsCountMap.put(productCategoryId, noOfItemsInCart + count);
        } else {
            productCategoryIdVsCountMap.put(productCategoryId, count);
        }
    }

    public void removeItemInCart(int productCategoryId, int count) {
        if (productCategoryIdVsCountMap.containsKey(productCategoryId)) {
            int noOfItemsInCart = productCategoryIdVsCountMap.get(productCategoryId);
            if (count - noOfItemsInCart == 0) {
                productCategoryIdVsCountMap.remove(productCategoryId);
            } else {
                productCategoryIdVsCountMap.put(productCategoryId, noOfItemsInCart-count);
            }
        }
    }

    public void emptyCart() {
        this.productCategoryIdVsCountMap = new HashMap<>();
    }

    public Map<Integer,Integer> getCartItems() {
        return productCategoryIdVsCountMap;
    }
}
