package z_g_35_memento_design_pattern;

public class TextEditorApp {

    public static void main(String[] args) {
        Editor editor = new Editor();
        History history = new History();

        editor.type("Hello");
        history.save(editor.save());

        editor.type(" World");
        history.save(editor.save());

        editor.type("!");

        System.out.println("Current content: " + editor.getContent());

        // Undo last typing
        editor.restore(history.undo());
        System.out.println("After undo 1: " + editor.getContent());

        editor.restore(history.undo());
        System.out.println("After undo 2: " + editor.getContent());
    }
}
