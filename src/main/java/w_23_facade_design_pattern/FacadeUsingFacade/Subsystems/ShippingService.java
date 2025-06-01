package w_23_facade_design_pattern.FacadeUsingFacade.Subsystems;

public class ShippingService {
    public void ship(String itemId, String address) {
        System.out.println("Shipping item " + itemId + " to " + address);
    }
}
