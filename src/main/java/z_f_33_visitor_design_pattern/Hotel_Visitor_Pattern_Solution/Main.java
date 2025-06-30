package z_f_33_visitor_design_pattern.Hotel_Visitor_Pattern_Solution;

import z_f_33_visitor_design_pattern.Hotel_Visitor_Pattern_Solution.rooms.DeluxeRoom;
import z_f_33_visitor_design_pattern.Hotel_Visitor_Pattern_Solution.rooms.Room;
import z_f_33_visitor_design_pattern.Hotel_Visitor_Pattern_Solution.rooms.StandardRoom;
import z_f_33_visitor_design_pattern.Hotel_Visitor_Pattern_Solution.visitors.CleanRoomVisitor;
import z_f_33_visitor_design_pattern.Hotel_Visitor_Pattern_Solution.visitors.DiscountVisitor;
import z_f_33_visitor_design_pattern.Hotel_Visitor_Pattern_Solution.visitors.InvoiceVisitor;
import z_f_33_visitor_design_pattern.Hotel_Visitor_Pattern_Solution.visitors.RoomVisitor;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Room> rooms = List.of(new StandardRoom(150), new DeluxeRoom(300));

        System.out.println("=== Reserving rooms ===");
        for (Room room : rooms) {
            room.reserve();
        }

        System.out.println("\n=== Rooms getting cleaned ===");
        RoomVisitor cleanRoomVisitor = new CleanRoomVisitor();
        for(Room room: rooms) {
            room.accept(cleanRoomVisitor);
        }

        System.out.println("\n=== Applying 10% discount ===");
        RoomVisitor discountVisitor = new DiscountVisitor(0.1);
        for (Room room : rooms) {
            room.accept(discountVisitor);
        }

        System.out.println("\n=== Generating invoices ===");
        RoomVisitor invoiceVisitor = new InvoiceVisitor();
        for (Room room : rooms) {
            room.accept(invoiceVisitor);
        }


    }
}
