package z_f_33_visitor_design_pattern.Hotel_Problem.rooms;



public abstract class Room {
    protected double baseRate;
    protected boolean reserved;

    public Room(double baseRate) {
        this.baseRate = baseRate;
        this.reserved = false;
    }

    public abstract double calculateCost();

    public void reserve() {
        if (!reserved) {
            reserved = true;
            System.out.println(getClass().getSimpleName() + " reserved.");
        } else {
            System.out.println(getClass().getSimpleName() + " is already reserved.");
        }
    }

    // New operation added here (problem!)
    public abstract void generateInvoice();

    // Another new operation (problem!)
    public abstract void applyDiscount(double percent);
}

