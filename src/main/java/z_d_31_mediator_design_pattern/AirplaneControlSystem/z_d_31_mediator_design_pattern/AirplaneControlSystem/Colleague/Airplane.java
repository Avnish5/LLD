package z_d_31_mediator_design_pattern.AirplaneControlSystem.z_d_31_mediator_design_pattern.AirplaneControlSystem.Colleague;

import z_d_31_mediator_design_pattern.AirplaneControlSystem.z_d_31_mediator_design_pattern.AirplaneControlSystem.Mediator.AirTrafficControl;

public interface Airplane {

    void setAirTrafficControl(AirTrafficControl ac);
    boolean requestTakeOff();
    boolean requestLanding();
    String getId();
    void receiveMessage(String message);
}
