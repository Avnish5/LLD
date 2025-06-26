package z_d_31_mediator_design_pattern.AirplaneControlSystem.z_d_31_mediator_design_pattern.AirplaneControlSystem.Mediator;

import z_d_31_mediator_design_pattern.AirplaneControlSystem.z_d_31_mediator_design_pattern.AirplaneControlSystem.Colleague.Airplane;

import java.util.HashSet;
import java.util.Set;

public class ControlTower implements AirTrafficControl {

    private Set<Airplane> airplanes;
    private boolean runwayFree;

    public ControlTower() {
        airplanes = new HashSet<>();
        runwayFree = true;
    }

    @Override
    public void registerAirplane(Airplane airplane) {
        airplanes.add(airplane);
        airplane.setAirTrafficControl(this);
        System.out.println("Airplane " + airplane.getId() + " registered with control tower.");

    }

    @Override
    public synchronized boolean requestTakeOff(Airplane airplane) {
        System.out.println(airplane.getId() + " request takeOff");

        if(runwayFree) {
            runwayFree = false;
            notifyStatus(airplane, " Takeoff granted. Runway is clear.");
            return true;
        } else {
            notifyStatus(airplane, " Takeoff denied. Runway is busy.");
            return false;
        }

    }

    @Override
    public synchronized boolean requestLanding(Airplane airplane) {
        System.out.println(airplane.getId() + " requests landing.");
        if (runwayFree) {
            runwayFree = false;
            notifyStatus(airplane, " Landing granted. Runway is clear.");
            return true;
        } else {
            notifyStatus(airplane, " Landing denied. Runway is busy.");
            return false;
        }
    }

    @Override
    public  synchronized void notifyStatus(Airplane airplane, String status) {
            airplane.receiveMessage(status);
    }

    public synchronized void runawayVacated() {
        System.out.println("Runway is free");
        runwayFree = true;
    }

}
