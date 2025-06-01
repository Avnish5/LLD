package w_23_facade_design_pattern.Inventory;
// Subsystem: Inventory
public interface InventoryService {
    boolean checkStock(String itemId, int quantity);
}
