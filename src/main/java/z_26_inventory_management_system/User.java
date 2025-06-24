package z_26_inventory_management_system;

import java.util.ArrayList;
import java.util.List;

public class User {
    int userID;
    String userName;
    Cart userCartDetails;
    List<Integer> orderIDs;
    Address address;

    public User() {
        userCartDetails = new Cart();
        orderIDs = new ArrayList<>();
    }

    public Cart getUserCart() {
        return userCartDetails;
    }
}
