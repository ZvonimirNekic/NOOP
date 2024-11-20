package pkcg_text_editor;

public class DeleteTextCommand implements TextCommand{

    private String text;
    private EditorOfText textEditor;

    public DeleteTextCommand(String text, EditorOfText textEditor){
        this.textEditor = textEditor;
        this.text = text;

    }

    @Override
    public boolean executeCommand() {
        return textEditor.removeTextFromTextArea(text);
    }

    @Override
    public void undoCommand() {
        textEditor.addTextToTextArea(text);
    }

    @Override
    public void redoCommand() {
        executeCommand();
    }




}
