package z_b_28_command_design_pattern.TextEditor.command;

import z_b_28_command_design_pattern.TextEditor.reciever.TextDocument;

public class DeleteTextCommand implements Command{

    private TextDocument document;
    int start, end;
    private String deletedText;

    public DeleteTextCommand(TextDocument document, int start, int end) {
        this.document = document;
        this.start = start;
        this.end = end;
    }

    @Override
    public void execute() {
       this.deletedText = document.delete(start, end);
    }

    @Override
    public void undo() {
        document.insert(start, deletedText);
    }
}
