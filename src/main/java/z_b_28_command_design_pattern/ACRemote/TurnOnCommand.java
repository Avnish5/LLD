package z_b_28_command_design_pattern.ACRemote;


//Concrete Commands
public class TurnOnCommand implements Command{

    AirConditioner ac;

    public TurnOnCommand(AirConditioner ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        ac.turnOn();
    }
}
