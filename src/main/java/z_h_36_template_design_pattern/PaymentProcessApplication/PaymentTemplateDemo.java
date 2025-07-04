package z_h_36_template_design_pattern.PaymentProcessApplication;

import z_h_36_template_design_pattern.PaymentProcessApplication.processor.CreditCardPayment;
import z_h_36_template_design_pattern.PaymentProcessApplication.processor.PayPalPayment;
import z_h_36_template_design_pattern.PaymentProcessApplication.processor.PaymentProcessor;

public class PaymentTemplateDemo {
    public static void main(String[] args) {
        System.out.println("=== Credit Card Payment ===");
        PaymentProcessor ccPayment = new CreditCardPayment();
        ccPayment.makePayment();

        System.out.println("\n=== PayPal Payment ===");
        PaymentProcessor paypalPayment = new PayPalPayment();
        paypalPayment.makePayment();
    }
}
