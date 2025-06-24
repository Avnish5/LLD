package z_26_inventory_management_system;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Inventory {

    List<ProductCategory> productCategoryList;

    public Inventory() {
        this.productCategoryList = new ArrayList<>();
    }

    public void addCategory(int categoryId, String name, int price) {
        ProductCategory productCategory = new ProductCategory();
        productCategory.price = price;
        productCategory.categoryName = name;
        productCategory.productCategoryId = categoryId;
        productCategoryList.add(productCategory);
    }

    public void addProduct(Product product, int productCategoryId) {
        ProductCategory categoryObject = null;

        for (ProductCategory category : productCategoryList) {
            if (category.productCategoryId == productCategoryId) {
                categoryObject = category;
            }
        }

        if (categoryObject != null) {
            categoryObject.addProduct(product);
        }
    }

    public void removeItems(Map<Integer, Integer> productCategoryAndCountMap) {
        for (Map.Entry<Integer, Integer> entry : productCategoryAndCountMap.entrySet()) {
            ProductCategory category = getProductCategoryFromID(entry.getKey());
            category.removeProduct(entry.getValue());
        }
    }

    private ProductCategory getProductCategoryFromID(int productCategoryId) {
        for (ProductCategory category : productCategoryList) {
            if (category.productCategoryId == productCategoryId) {
                return category;
            }
        }

        return null;
    }

}
