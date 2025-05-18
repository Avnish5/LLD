package c_3_statergy_design_pattern.with;

import c_3_statergy_design_pattern.with.statergy.HeavyDriveStrategy;

public class OffRoadVehicle extends Vehicle{
    public OffRoadVehicle() {
        super(new HeavyDriveStrategy());
    }
}
