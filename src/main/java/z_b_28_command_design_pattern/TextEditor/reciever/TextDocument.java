package z_b_28_command_design_pattern.TextEditor.reciever;

public class TextDocument {

    private StringBuilder text = new StringBuilder();

    public void insert(int pos, String content) {
        text.insert(pos, content);
    }

    public String delete(int start, int end) {
        String delete = text.substring(start, end);
        text.delete(start, end);
        return delete;
    }

    public String getText() {
        return text.toString();
    }
}
