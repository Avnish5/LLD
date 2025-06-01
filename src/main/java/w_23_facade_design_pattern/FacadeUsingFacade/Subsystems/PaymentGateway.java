package w_23_facade_design_pattern.FacadeUsingFacade.Subsystems;

public class PaymentGateway {
    public void charge(String account, double amount) {
        System.out.println("Charging $" + amount + " from " + account);
    }
}
