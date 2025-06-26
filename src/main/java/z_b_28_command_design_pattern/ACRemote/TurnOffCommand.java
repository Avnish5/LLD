package z_b_28_command_design_pattern.ACRemote;

//Concrete Commands
public class TurnOffCommand implements Command{

    AirConditioner ac;

    public TurnOffCommand(AirConditioner ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        ac.turnOff();
    }
}
