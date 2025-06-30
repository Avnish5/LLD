package z_f_33_visitor_design_pattern.Hotel_Problem;

import z_f_33_visitor_design_pattern.Hotel_Problem.rooms.DeluxeRoom;
import z_f_33_visitor_design_pattern.Hotel_Problem.rooms.Room;
import z_f_33_visitor_design_pattern.Hotel_Problem.rooms.StandardRoom;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Room> rooms = List.of(
                new StandardRoom(100),
                new DeluxeRoom(150)
        );

        System.out.println("=== Reserving rooms ===");
        for (Room room : rooms) {
            room.reserve();
        }

        System.out.println("\n=== Applying 10% discount ===");
        for (Room room : rooms) {
            room.applyDiscount(0.1);
        }

        System.out.println("\n=== Generating invoices ===");
        for (Room room : rooms) {
            room.generateInvoice();
        }
    }
}
