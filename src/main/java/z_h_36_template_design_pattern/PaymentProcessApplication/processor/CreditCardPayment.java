package z_h_36_template_design_pattern.PaymentProcessApplication.processor;

public class CreditCardPayment extends PaymentProcessor{

    @Override
    protected void authenticateUser() {
        System.out.println("Authenticating user with credit card PIN.");
    }

    @Override
    protected void processPayment() {
        System.out.println("Processing payment using credit card.");
    }
}
