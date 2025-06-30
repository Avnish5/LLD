package z_f_33_visitor_design_pattern.Hotel_Problem.rooms;

public class DeluxeRoom extends Room{

    public DeluxeRoom(double baseRate) {
        super(baseRate);
    }

    @Override
    public double calculateCost() {
        return baseRate * 1.2;
    }

    @Override
    public void generateInvoice() {
        System.out.println("Generating invoice for DeluxeRoom: $" + calculateCost());
    }

    @Override
    public void applyDiscount(double percent) {
        double discounted = calculateCost() * (1 - percent);
        System.out.println("Discounted price for DeluxeRoom: $" + discounted);
    }
}
