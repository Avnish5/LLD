package z_b_28_command_design_pattern.TextEditor.command;

import z_b_28_command_design_pattern.TextEditor.reciever.TextDocument;

public class InsertTextCommand implements Command{

    private TextDocument document;
    private String text;
    private int pos;

    public InsertTextCommand(TextDocument document, String text, int pos) {
        this.document = document;
        this.text = text;
        this.pos = pos;
    }

    @Override
    public void execute() {
        document.insert(pos, text);
    }

    @Override
    public void undo() {
       document.delete(pos, pos + text.length());
    }
}
