package c_3_statergy_design_pattern.with;

import c_3_statergy_design_pattern.with.statergy.HeavyDriveStrategy;

public class TransportVehicle extends Vehicle{
    public TransportVehicle() {
        super(new HeavyDriveStrategy());
    }
}
