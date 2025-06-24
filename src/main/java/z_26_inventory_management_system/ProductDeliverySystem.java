package z_26_inventory_management_system;

import java.util.List;

public class ProductDeliverySystem {
    WareHouseController wareHouseController;
    OrderController orderController;
    UserController userController;

    ProductDeliverySystem(List<User> userList, List<WareHouse> wareHouseList) {
        this.wareHouseController = new WareHouseController(wareHouseList, null);
        userController = new UserController(userList);
        orderController = new OrderController();
    }

    public User getUser(int userId) {
        return userController.getUser(userId);
    }

    public WareHouse getWareHouse(WarehouseSelectionStrategy warehouseSelectionStrategy) {
        return wareHouseController.selectWareHose(warehouseSelectionStrategy);
    }

    public Inventory getInventory(WareHouse wareHouse) {
        return wareHouse.inventory;
    }

    public void addProductToCart(User user, ProductCategory productCategory, int count) {
        Cart cart = user.getUserCart();
        cart.addItemInCart(productCategory.productCategoryId, count);
    }

    public Order placeOrder(User user, WareHouse wareHouse) {
        return orderController.createNewOrder(user,wareHouse);
    }
    public void checkout(Order order){
        order.checkOut();
    }

}
