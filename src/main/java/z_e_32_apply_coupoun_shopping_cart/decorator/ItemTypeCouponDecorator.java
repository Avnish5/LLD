package z_e_32_apply_coupoun_shopping_cart.decorator;

import z_e_32_apply_coupoun_shopping_cart.cart.ShoppingCart;
import z_e_32_apply_coupoun_shopping_cart.model.ItemType;

public class ItemTypeCouponDecorator extends CartDecorator{
    private final ItemType type;
    private final double discountAmount;
    public ItemTypeCouponDecorator(ShoppingCart cart, ItemType type, double discountAmount) {
        super(cart);
        this.type = type;
        this.discountAmount = discountAmount;
        applyDiscount();
    }

    private void applyDiscount() {

        var filteredItems = items.stream().
                filter(i -> i.getType() == type)
                .toList();
        if (filteredItems.isEmpty()) return;

        double discountPerItem = discountAmount / filteredItems.size();

        for (var item : filteredItems) {
            double newPrice = item.getPrice() - discountPerItem;
            item.setPrice(newPrice < 0 ? 0 : newPrice);
        }
    }
}
