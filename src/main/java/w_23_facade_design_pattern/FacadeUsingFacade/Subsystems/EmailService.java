package w_23_facade_design_pattern.FacadeUsingFacade.Subsystems;

public class EmailService {
    public void sendConfirmation(String email) {
        System.out.println("Sending confirmation to " + email);
    }
}
