package z_g_35_memento_design_pattern;

import java.util.Stack;

public class History {
    private Stack<EditorMemento> history = new Stack<>();

    public void save(EditorMemento memento) {
        history.push(memento);
    }

    public EditorMemento undo() {
        if (!history.isEmpty()) {
            return history.pop();
        }
        return null;
    }
}
