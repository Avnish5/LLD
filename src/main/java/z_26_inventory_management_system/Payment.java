package z_26_inventory_management_system;

public class Payment {

    PaymentMode paymentMode;

    public Payment(PaymentMode paymentMode) {
        this.paymentMode = paymentMode;
    }

    public boolean makePayment() {
        return this.paymentMode.makePayment();
    }
}
