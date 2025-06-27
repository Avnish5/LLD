package z_e_32_apply_coupoun_shopping_cart.cart;

import z_e_32_apply_coupoun_shopping_cart.model.Item;

import java.util.ArrayList;
import java.util.List;

public class BasicShoppingCart implements ShoppingCart{

    private List<Item> items;

    public BasicShoppingCart(List<Item> items) {
        this.items = new ArrayList<>();

        for (Item item : items) {
            this.items.add(item.clone());
        }
    }

    @Override
    public double getTotal() {
        return items.stream().mapToDouble(Item::getPrice).sum();
    }

    @Override
    public List<Item> getItems() {
       List<Item> copy = new ArrayList<>();

       for (Item item : items) {
           copy.add(item.clone());
       }

       return copy;
    }
}
