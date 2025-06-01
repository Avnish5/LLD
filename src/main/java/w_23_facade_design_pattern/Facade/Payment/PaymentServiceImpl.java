package w_23_facade_design_pattern.Facade.Payment;

public class PaymentServiceImpl implements PaymentService{
    public void processPayment(String account, double amount) {
        System.out.println("Processing payment of $" + amount + " from account: " + account);
    }
}
