package z_d_31_mediator_design_pattern.AirplaneControlSystem.z_d_31_mediator_design_pattern.AirplaneControlSystem.Mediator;

import z_d_31_mediator_design_pattern.AirplaneControlSystem.z_d_31_mediator_design_pattern.AirplaneControlSystem.Colleague.Airplane;

public interface AirTrafficControl {

    void registerAirplane(Airplane airplane);
    boolean requestTakeOff(Airplane airplane);
    boolean requestLanding(Airplane airplane);
    void notifyStatus(Airplane airplane, String status);
}
