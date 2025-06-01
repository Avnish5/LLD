package w_23_facade_design_pattern.FacadeUsingFacade.CustomerFacade;

import w_23_facade_design_pattern.FacadeUsingFacade.Subsystems.CustomerService;
import w_23_facade_design_pattern.FacadeUsingFacade.Subsystems.LoyaltyService;

public class CustomerFacade {
    private final CustomerService customerService = new CustomerService();
    private final LoyaltyService loyaltyService = new LoyaltyService();

    public void onboardCustomer(String name, String email) {
        customerService.createProfile(name, email);
        loyaltyService.applyLoyaltyPoints(email);
    }
}
