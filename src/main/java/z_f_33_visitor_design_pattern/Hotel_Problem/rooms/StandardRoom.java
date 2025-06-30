package z_f_33_visitor_design_pattern.Hotel_Problem.rooms;

public class StandardRoom extends Room{

    public StandardRoom(double baseRate) {
        super(baseRate);
    }

    @Override
    public double calculateCost() {
        return baseRate;
    }

    @Override
    public void generateInvoice() {
        System.out.println("Generating invoice for StandardRoom: $" + calculateCost());
    }

    @Override
    public void applyDiscount(double percent) {
        double discounted = calculateCost() * (1 - percent);
        System.out.println("Discounted price for StandardRoom: $" + discounted);
    }
}
