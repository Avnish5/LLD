package j_10_car_rental_system;



import j_10_car_rental_system.product.Vehicle;

import java.util.List;

public class VehicleInventoryManagement {

    List<Vehicle> vehicleList;

    public VehicleInventoryManagement(List<Vehicle> vehicleList) {
        this.vehicleList = vehicleList;
    }

    public List<Vehicle> getVehicleList() {
        //filtering
        return vehicleList;
    }

    public void setVehicleList(List<Vehicle> vehicleList) {
        this.vehicleList = vehicleList;
    }
}
