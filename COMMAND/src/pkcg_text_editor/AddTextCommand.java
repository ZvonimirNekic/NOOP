package pkcg_text_editor;

public class AddTextCommand implements TextCommand{

    private EditorOfText textEditor;
    private String someText;

    public AddTextCommand(String text, EditorOfText tEditor) {
        this.textEditor = tEditor;
        this.someText = text;
    }

    @Override
    public boolean executeCommand() {
       return textEditor.addTextToTextArea(someText);
    }

    @Override
    public void undoCommand() {
        textEditor.removeTextFromTextArea(someText);
    }

    @Override
    public void redoCommand() {
        executeCommand();
    }
}
