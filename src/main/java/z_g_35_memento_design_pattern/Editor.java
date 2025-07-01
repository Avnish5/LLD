package z_g_35_memento_design_pattern;

public class Editor {

    private StringBuilder content = new StringBuilder();

    public void type(String text) {
        content.append(text);
    }

    public String getContent() {
        return content.toString();
    }

    // Creates a memento (snapshot of current state)
    public EditorMemento save() {
        return new EditorMemento(content.toString());
    }

    // Restores the state from a memento
    public void restore(EditorMemento memento) {
        content = new StringBuilder(memento.getContent());
    }
}
