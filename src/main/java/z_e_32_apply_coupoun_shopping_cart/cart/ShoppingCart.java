package z_e_32_apply_coupoun_shopping_cart.cart;

import z_e_32_apply_coupoun_shopping_cart.model.Item;

import java.util.List;

public interface ShoppingCart {

    double getTotal();
    List<Item> getItems();
}
