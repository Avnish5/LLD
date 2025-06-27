package z_e_32_apply_coupoun_shopping_cart;

import z_e_32_apply_coupoun_shopping_cart.cart.BasicShoppingCart;
import z_e_32_apply_coupoun_shopping_cart.cart.ShoppingCart;
import z_e_32_apply_coupoun_shopping_cart.decorator.ItemTypeCouponDecorator;
import z_e_32_apply_coupoun_shopping_cart.decorator.PercentOffCouponDecorator;
import z_e_32_apply_coupoun_shopping_cart.model.Item;
import z_e_32_apply_coupoun_shopping_cart.model.ItemType;

import java.util.Arrays;
import java.util.List;

public class ShoppingCartDemo {

    public static void main(String[] args) {
        List<Item> items = Arrays.asList(
                new Item("Laptop", 1200.0, ItemType.ELECTRONICS),
                new Item("Mouse", 40.0, ItemType.ELECTRONICS),
                new Item("Jeans", 60.0, ItemType.CLOTHING),
                new Item("Novel", 20.0, ItemType.BOOKS)
        );

        ShoppingCart cart = new BasicShoppingCart(items);

        System.out.printf("Original total: $%.2f%n", cart.getTotal());

        ShoppingCart percentCoupon = new PercentOffCouponDecorator(cart, 10);
        System.out.printf("After 10%% off: $%.2f%n", percentCoupon.getTotal());

        ShoppingCart itemTypeCoupon = new ItemTypeCouponDecorator(percentCoupon, ItemType.ELECTRONICS, 100);
        System.out.printf("After $100 off electronics: $%.2f%n", itemTypeCoupon.getTotal());
    }
}
