package w_23_facade_design_pattern.Facade;

import w_23_facade_design_pattern.Inventory.InventoryService;
import w_23_facade_design_pattern.Inventory.InventoryServiceImpl;
import w_23_facade_design_pattern.Notification.NotificationService;
import w_23_facade_design_pattern.Notification.NotificationServiceImpl;
import w_23_facade_design_pattern.Payment.PaymentService;
import w_23_facade_design_pattern.Payment.PaymentServiceImpl;
import w_23_facade_design_pattern.Shipping.ShippingService;
import w_23_facade_design_pattern.Shipping.ShippingServiceImpl;

public class OrderFacade {
    private final InventoryService inventoryService;
    private final PaymentService paymentService;
    private final ShippingService shippingService;
    private final NotificationService notificationService;

    public OrderFacade() {
        this.inventoryService = new InventoryServiceImpl();
        this.paymentService = new PaymentServiceImpl();
        this.shippingService = new ShippingServiceImpl();
        this.notificationService = new NotificationServiceImpl();
    }

    public void placeOrder(String itemId, int quantity, double amount, String account, String address, String email) {
        System.out.println("\n--- Starting Order Process ---");

        if (inventoryService.checkStock(itemId, quantity)) {
            paymentService.processPayment(account, amount);
            shippingService.arrangeShipping(itemId, address);
            notificationService.sendConfirmation(email);
            System.out.println("--- Order placed successfully! ---\n");
        } else {
            System.out.println("Order failed: Item is out of stock.");
        }
    }
}

