package z_h_36_template_design_pattern.PaymentProcessApplication.processor;

public abstract  class PaymentProcessor {

    // Template Method (final to prevent overriding)
    public final void makePayment() {
        initializePayment();
        authenticateUser();
        processPayment();
        sendReceipt();
    }

    // Common step
    private void initializePayment() {
        System.out.println("Initializing payment process...");
    }

    // Abstract methods to be implemented by subclasses
    protected abstract void authenticateUser();
    protected abstract void processPayment();

    // Hook method (optional override)
    protected void sendReceipt() {
        System.out.println("Sending receipt to customer.");
    }
}
