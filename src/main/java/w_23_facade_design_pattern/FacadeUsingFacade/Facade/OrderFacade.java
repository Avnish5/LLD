package w_23_facade_design_pattern.FacadeUsingFacade.Facade;

import w_23_facade_design_pattern.FacadeUsingFacade.CustomerFacade.CustomerFacade;
import w_23_facade_design_pattern.FacadeUsingFacade.PaymentFacade.PaymentFacade;
import w_23_facade_design_pattern.FacadeUsingFacade.Subsystems.EmailService;
import w_23_facade_design_pattern.FacadeUsingFacade.Subsystems.InventoryService;
import w_23_facade_design_pattern.FacadeUsingFacade.Subsystems.ShippingService;

public class OrderFacade {
    private final InventoryService inventory = new InventoryService();
    private final ShippingService shipping = new ShippingService();
    private final EmailService emailService = new EmailService();

    private final CustomerFacade customerFacade = new CustomerFacade();
    private final PaymentFacade paymentFacade = new PaymentFacade();

    public void placeOrder(String itemId, int qty, String customerName, String customerEmail,
                           String paymentAccount, double amount, String shippingAddress) {

        System.out.println("\n--- Placing Order ---");

        customerFacade.onboardCustomer(customerName, customerEmail);

        if (!inventory.isAvailable(itemId, qty)) {
            System.out.println("Item out of stock.");
            return;
        }

        if (!paymentFacade.processPayment(paymentAccount, amount)) {
            System.out.println("Payment failed.");
            return;
        }

        shipping.ship(itemId, shippingAddress);
        emailService.sendConfirmation(customerEmail);

        System.out.println("--- Order Placed Successfully ---\n");
    }
}
