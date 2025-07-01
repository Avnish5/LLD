package z_g_35_memento_design_pattern;

public class EditorMemento {

    private final String content;

    public EditorMemento(String content) {
        this.content = content;
    }

    protected String getContent() {
        return content;
    }
}
