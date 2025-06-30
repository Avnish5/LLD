package z_f_33_visitor_design_pattern.Hotel_Visitor_Pattern_Solution.rooms;

import z_f_33_visitor_design_pattern.Hotel_Visitor_Pattern_Solution.visitors.RoomVisitor;

public class DeluxeRoom extends Room {

    public DeluxeRoom(double baseRate) {
        super(baseRate);
    }

    @Override
    public double calculateCost() {
        return baseRate * 1.2;
    }

    @Override
    public void accept(RoomVisitor visitor) {
        visitor.visit(this);
    }
}
