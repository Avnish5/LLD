package z_e_32_apply_coupoun_shopping_cart.decorator;

import z_e_32_apply_coupoun_shopping_cart.cart.ShoppingCart;
import z_e_32_apply_coupoun_shopping_cart.model.Item;

import java.util.List;

public class PercentOffCouponDecorator extends CartDecorator{

    private final double percent;
    public PercentOffCouponDecorator(ShoppingCart cart, double percent) {
        super(cart);

        if (percent < 0 || percent > 100)
            throw new IllegalArgumentException("Percent must be between 0 and 100");
        this.percent = percent;
        applyDiscount();
    }

    private void applyDiscount() {

        for (var item : items) {
            double discountedPrice = item.getPrice() * (1 - percent / 100.0);
            item.setPrice(discountedPrice);
        }
    }
}
