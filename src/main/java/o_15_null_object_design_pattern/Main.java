package o_15_null_object_design_pattern;

public class Main {

    public static void main(String[] args) {
        Vehicle vehicle = VehicleFactory.getVehicleObject("BIKE");
        printVehicle(vehicle);

    }

    private static void printVehicle(Vehicle vehicle) {
        System.out.println("Seating Capacity: " + vehicle.getSeatingCapacity());
        System.out.println("Tank Capacity: " + vehicle.getTankCapacity());
    }
}
