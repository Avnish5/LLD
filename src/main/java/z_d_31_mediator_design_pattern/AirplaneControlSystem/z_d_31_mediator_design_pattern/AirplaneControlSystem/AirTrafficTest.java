package z_d_31_mediator_design_pattern.AirplaneControlSystem.z_d_31_mediator_design_pattern.AirplaneControlSystem;

import z_d_31_mediator_design_pattern.AirplaneControlSystem.z_d_31_mediator_design_pattern.AirplaneControlSystem.Colleague.Airplane;
import z_d_31_mediator_design_pattern.AirplaneControlSystem.z_d_31_mediator_design_pattern.AirplaneControlSystem.Colleague.CommercialAirplane;
import z_d_31_mediator_design_pattern.AirplaneControlSystem.z_d_31_mediator_design_pattern.AirplaneControlSystem.Mediator.AirTrafficControl;
import z_d_31_mediator_design_pattern.AirplaneControlSystem.z_d_31_mediator_design_pattern.AirplaneControlSystem.Mediator.ControlTower;

public class AirTrafficTest {
    public static void main(String[] args) {
        AirTrafficControl tower = new ControlTower();

        Airplane plane1 = new CommercialAirplane("Flight-101");
        Airplane plane2 = new CommercialAirplane("Flight-202");

        tower.registerAirplane(plane1);
        tower.registerAirplane(plane2);

        // Flight-101 tries to take off
        plane1.requestTakeOff();

        // Flight-202 tries to take off while runway busy
        plane2.requestTakeOff();

        // After Flight-101 took off, Flight-202 tries again
        plane2.requestTakeOff();

        // Flight-101 tries to land
        plane1.requestLanding();
    }
}
