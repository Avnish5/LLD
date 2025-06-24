package z_26_inventory_management_system;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderController {
    List<Order> orderList;
    Map<Integer, List<Order>> userIdVsOrders;

    OrderController() {
        this.orderList = new ArrayList<>();
        this.userIdVsOrders = new HashMap<>();
    }

    //create New Order
    public Order createNewOrder(User user, WareHouse warehouse){
        Order order = new Order(user, warehouse);
        orderList.add(order);

        if(userIdVsOrders.containsKey(user.userID)){
            List<Order> userOrders = userIdVsOrders.get(user.userID);
            userOrders.add(order);
            userIdVsOrders.put(user.userID, userOrders);
        } else {
            List<Order> userOrders = new ArrayList<>();
            userOrders.add(order);
           userIdVsOrders.put(user.userID, userOrders);

        }
        return order;
    }


    //remove order
    public void removeOrder(Order order){

        //remove order capability goes here
    }

    public List<Order> getOrderByCustomerId(int userId){
        return null;
    }

    public Order getOrderByOrderId(int orderId){
        return null;
    }


}
