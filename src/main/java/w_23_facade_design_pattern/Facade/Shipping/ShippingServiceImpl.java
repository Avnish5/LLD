package w_23_facade_design_pattern.Facade.Shipping;

public class ShippingServiceImpl implements ShippingService{
    public void arrangeShipping(String itemId, String address) {
        System.out.println("Arranging shipping for item " + itemId + " to address: " + address);
    }
}
