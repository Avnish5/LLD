package z_b_28_command_design_pattern.ACRemote;

//Concrete Commands
public class SetTemperatureCommand implements Command{

    AirConditioner ac;
    int temperature;

    public SetTemperatureCommand(AirConditioner ac,int temperature) {
        this.ac = ac;
        this.temperature = temperature;
    }

    @Override
    public void execute() {
        ac.setTemperature(temperature);
    }
}
