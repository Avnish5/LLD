package c_3_statergy_design_pattern.with;

public class Main {

    public static void main(String[] args) {
        Vehicle offRoadVehicle = new OffRoadVehicle();
        Vehicle transportVehicle = new TransportVehicle();

        offRoadVehicle.drive();
        transportVehicle.drive();
    }




}
