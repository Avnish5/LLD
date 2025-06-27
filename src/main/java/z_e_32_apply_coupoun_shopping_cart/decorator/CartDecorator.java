package z_e_32_apply_coupoun_shopping_cart.decorator;

import z_e_32_apply_coupoun_shopping_cart.cart.ShoppingCart;
import z_e_32_apply_coupoun_shopping_cart.model.Item;

import java.util.ArrayList;
import java.util.List;

public abstract class CartDecorator implements ShoppingCart {
    protected ShoppingCart cart;
    protected List<Item> items;

    public CartDecorator(ShoppingCart cart) {
        this.cart = cart;
        this.items = new ArrayList<>();
        for (Item item : cart.getItems()) {
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
