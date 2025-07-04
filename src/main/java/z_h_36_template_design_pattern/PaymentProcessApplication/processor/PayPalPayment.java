package z_h_36_template_design_pattern.PaymentProcessApplication.processor;

public class PayPalPayment extends PaymentProcessor{

    @Override
    protected void authenticateUser() {
        System.out.println("Authenticating user via PayPal credentials.");
    }

    @Override
    protected void processPayment() {
        System.out.println("Processing payment using PayPal.");
    }

    // Optional: override hook
    @Override
    protected void sendReceipt() {
        System.out.println("Sending PayPal transaction receipt to email.");
    }
}
