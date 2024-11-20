package pkcg_text_editor;

public class AppTest {
    public static void main(String[] args) {

        TextEditor textEditor = new TextEditor();
        BufferTextEditor bufferTextEditor = new BufferTextEditor();
        TextCommandInvoker textCommandInvoker = new TextCommandInvoker();
        AddTextCommand addTextCommand1 = new AddTextCommand("Fst string to add.", textEditor);
        textCommandInvoker.runCommand(addTextCommand1);
        AddTextCommand addTextCommand2 = new AddTextCommand("Any string to add...", textEditor);
        textCommandInvoker.runCommand(addTextCommand2);
        AddTextCommand addTextCommand3 = new AddTextCommand("Something new to add", textEditor);
        textCommandInvoker.runCommand(addTextCommand3);

        DeleteTextCommand deleteTextCommand1 = new DeleteTextCommand("Any string to add...", textEditor);
    //    textCommandInvoker.runCommand(deleteTextCommand1);






    }
}
