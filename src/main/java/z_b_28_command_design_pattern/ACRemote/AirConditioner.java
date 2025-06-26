package z_b_28_command_design_pattern.ACRemote;

//Receiver
public class AirConditioner {

    public void turnOn() {
        System.out.println("AC is on");
    }

    public void turnOff() {
        System.out.println("AC is off");
    }

    public void setTemperature(int temperature) {
        System.out.println("Temperature is set to " + temperature);
    }
}
