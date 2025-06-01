package w_23_facade_design_pattern.FacadeUsingFacade.Subsystems;

public class InventoryService {

    public boolean isAvailable(String itemId, int qty) {
        System.out.println("Checking inventory for " + itemId);
        return true;
    }
}
