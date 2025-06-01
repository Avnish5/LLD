package w_23_facade_design_pattern.FacadeUsingFacade.Subsystems;

public class CustomerService {
    public void createProfile(String name, String email) {
        System.out.println("Creating customer profile for " + name);
    }
}
