package w_23_facade_design_pattern.Inventory;

public class InventoryServiceImpl implements InventoryService{
    public boolean checkStock(String itemId, int quantity) {
        System.out.println("Checking stock for item: " + itemId);
        return true; // Assume it's always available
    }
}
