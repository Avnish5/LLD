package z_f_33_visitor_design_pattern.Hotel_Visitor_Pattern_Solution.visitors;

import z_f_33_visitor_design_pattern.Hotel_Visitor_Pattern_Solution.rooms.DeluxeRoom;
import z_f_33_visitor_design_pattern.Hotel_Visitor_Pattern_Solution.rooms.StandardRoom;

public class DiscountVisitor implements RoomVisitor{

    private double discountPercent;

    public DiscountVisitor(double discountPercent) {
        this.discountPercent = discountPercent;
    }

    @Override
    public void visit(StandardRoom room) {
        double discountedPrice = room.calculateCost() * (1 - discountPercent);
        System.out.println("Discounted price for StandardRoom: $" + discountedPrice);
    }

    @Override
    public void visit(DeluxeRoom room) {
        double discountedPrice = room.calculateCost() * (1 - discountPercent);
        System.out.println("Discounted price for DeluxeRoom: $" + discountedPrice);
    }
}
