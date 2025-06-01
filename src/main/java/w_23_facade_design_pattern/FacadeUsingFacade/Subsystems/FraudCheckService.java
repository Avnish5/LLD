package w_23_facade_design_pattern.FacadeUsingFacade.Subsystems;

public class FraudCheckService {
    public boolean verify(String account) {
        System.out.println("Running fraud check on " + account);
        return true;
    }
}
