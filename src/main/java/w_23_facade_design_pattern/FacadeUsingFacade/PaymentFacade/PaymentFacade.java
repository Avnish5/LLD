package w_23_facade_design_pattern.FacadeUsingFacade.PaymentFacade;

import w_23_facade_design_pattern.FacadeUsingFacade.Subsystems.FraudCheckService;
import w_23_facade_design_pattern.FacadeUsingFacade.Subsystems.PaymentGateway;

public class PaymentFacade {
    private final PaymentGateway gateway = new PaymentGateway();
    private final FraudCheckService fraudCheck = new FraudCheckService();

    public boolean processPayment(String account, double amount) {
        if (fraudCheck.verify(account)) {
            gateway.charge(account, amount);
            return true;
        }
        System.out.println("Payment failed fraud check.");
        return false;
    }
}
