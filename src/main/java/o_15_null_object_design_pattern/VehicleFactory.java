package o_15_null_object_design_pattern;

public class VehicleFactory {

    static Vehicle getVehicleObject(String typeOfVehicle) {

        if ("CAR".equals(typeOfVehicle)) {
            return new Car();
        }

        return new NullVehicle();
    }
}
