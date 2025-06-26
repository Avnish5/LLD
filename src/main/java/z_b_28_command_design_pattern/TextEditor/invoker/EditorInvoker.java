package z_b_28_command_design_pattern.TextEditor.invoker;

import z_b_28_command_design_pattern.ACRemote.Command;

import java.util.Stack;

public class EditorInvoker {

    Stack<Command> undoStack = new Stack<>();
    Stack<Command> redoStack = new Stack<>();

    public void execute(Command command) {
        command.execute();
    }

}
