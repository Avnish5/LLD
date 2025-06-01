package w_23_facade_design_pattern.FacadeUsingFacade;

import w_23_facade_design_pattern.FacadeUsingFacade.Facade.OrderFacade;

public class Client {
    public static void main(String[] args) {
        OrderFacade orderFacade = new OrderFacade();

        orderFacade.placeOrder(
                "ITEM123",
                2,
                "Jane Doe",
                "jane@example.com",
                "ACC456",
                199.99,
                "456 Street, NY"
        );
    }
}
