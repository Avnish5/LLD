package z_b_28_command_design_pattern.ACRemote;

//Invoker
public class RemoteControl {

    public void submit(Command command) {
        command.execute();
    }
}
