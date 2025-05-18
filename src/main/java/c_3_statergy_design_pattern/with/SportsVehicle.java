package c_3_statergy_design_pattern.with;

import c_3_statergy_design_pattern.with.statergy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle{

    SportsVehicle() {
        super(new SportsDriveStrategy());
    }
}
