package z_d_31_mediator_design_pattern.AirplaneControlSystem.z_d_31_mediator_design_pattern.AirplaneControlSystem.Colleague;

import z_d_31_mediator_design_pattern.AirplaneControlSystem.z_d_31_mediator_design_pattern.AirplaneControlSystem.Mediator.AirTrafficControl;
import z_d_31_mediator_design_pattern.AirplaneControlSystem.z_d_31_mediator_design_pattern.AirplaneControlSystem.Mediator.ControlTower;

public class CommercialAirplane implements  Airplane{

    private String id;
    private AirTrafficControl atc;

    public CommercialAirplane(String id) {
        this.id = id;
    }

    @Override
    public void setAirTrafficControl(AirTrafficControl ac) {
        this.atc = ac;
    }

    @Override
    public boolean requestTakeOff() {
        boolean granted = atc.requestTakeOff(this);
        if (granted) {
            System.out.println(id + " is taking off...");
            // Simulate takeoff complete
            completeTakeOff();
        }
        return granted;
    }

    @Override
    public boolean requestLanding() {
        boolean granted = atc.requestLanding(this);
        if (granted) {
            System.out.println(id + " is landing...");
            // Simulate landing complete
            completeLanding();
        }
        return granted;
    }
    @Override
    public String getId() {
        return id;
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println("Message to " + id + message);
    }

    private void completeTakeOff() {
        System.out.println(id + " has taken off.");
        ((ControlTower) atc).runawayVacated();
    }

    private void completeLanding() {
        System.out.println(id + " has landed.");
        ((ControlTower) atc).runawayVacated();
    }
}
