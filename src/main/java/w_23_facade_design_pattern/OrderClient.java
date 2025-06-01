package w_23_facade_design_pattern;

import w_23_facade_design_pattern.Facade.OrderFacade;

public class OrderClient {
    public static void main(String[] args) {
        OrderFacade orderFacade = new OrderFacade();

        // Client places an order with a single method call
        orderFacade.placeOrder(
                "ITEM123",
                2,
                149.99,
                "user-bank-account-01",
                "123 Street, City, Country",
                "user@example.com"
        );
    }
}
