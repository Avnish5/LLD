package z_f_33_visitor_design_pattern.Hotel_Visitor_Pattern_Solution.visitors;


import z_f_33_visitor_design_pattern.Hotel_Visitor_Pattern_Solution.rooms.DeluxeRoom;
import z_f_33_visitor_design_pattern.Hotel_Visitor_Pattern_Solution.rooms.StandardRoom;


public interface RoomVisitor {
    void visit(StandardRoom room);
    void visit(DeluxeRoom room);
}
