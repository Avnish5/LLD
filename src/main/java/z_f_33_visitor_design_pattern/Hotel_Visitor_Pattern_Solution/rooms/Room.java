package z_f_33_visitor_design_pattern.Hotel_Visitor_Pattern_Solution.rooms;

import z_f_33_visitor_design_pattern.Hotel_Visitor_Pattern_Solution.visitors.RoomVisitor;

public abstract class Room {

    protected double baseRate;
    protected boolean reserved;

    public Room(double baseRate) {
        this.baseRate = baseRate;
        this.reserved = false;
    }

    public void reserve() {
        if (!reserved) {
            reserved = true;
            System.out.println(getClass().getSimpleName() + " reserved.");
        } else {
            System.out.println(getClass().getSimpleName() + " is already reserved.");
        }
    }

    public abstract double calculateCost();

    //Accept method for visitor
    public abstract void accept(RoomVisitor visitor);
}
