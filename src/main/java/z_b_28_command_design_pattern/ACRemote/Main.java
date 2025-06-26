package z_b_28_command_design_pattern.ACRemote;

//Client
public class Main {
    public static void main(String[] args) {
        AirConditioner airConditioner = new AirConditioner();

        Command turnOn = new TurnOnCommand(airConditioner);
        Command turnOff = new TurnOffCommand(airConditioner);
        Command setTemp = new SetTemperatureCommand(airConditioner, 24);

        RemoteControl remote = new RemoteControl();

        remote.submit(turnOn);
        remote.submit(setTemp);
        remote.submit(turnOff);


    }
}
