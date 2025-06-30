package z_f_33_visitor_design_pattern.Hotel_Visitor_Pattern_Solution.visitors;

import z_f_33_visitor_design_pattern.Hotel_Visitor_Pattern_Solution.rooms.DeluxeRoom;
import z_f_33_visitor_design_pattern.Hotel_Visitor_Pattern_Solution.rooms.StandardRoom;

public class InvoiceVisitor implements RoomVisitor{

    @Override
    public void visit(StandardRoom room) {
        System.out.println("Generating invoice for StandardRoom: $" + room.calculateCost());
    }

    @Override
    public void visit(DeluxeRoom room) {
        System.out.println("Generating invoice for DeluxeRoom: $" + room.calculateCost());
    }
}
