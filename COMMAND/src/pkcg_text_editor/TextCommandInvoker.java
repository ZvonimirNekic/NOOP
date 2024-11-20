package pkcg_text_editor;

import java.util.Stack;

public class TextCommandInvoker {
    private TextCommand textCommand;
    private final Stack<TextCommand> undoStack;
    private final Stack<TextCommand> redoStack;

    public TextCommandInvoker(){
        this.undoStack = new Stack<>();
        this.redoStack = new Stack<>();
    }

    public void runCommand(TextCommand textCommand){
        this.textCommand = textCommand;
        if(textCommand.executeCommand()){
            undoStack.push(textCommand);
        }else {
            System.out.println("Command is not executed due to some reasons!");
        }
        getStacksStatus();
    }

    public void undoCommand(){
        if(undoStack.isEmpty()){
            System.out.println("Nothing to undo!!!");
        }else {
            this.textCommand = undoStack.pop();
            textCommand.undoCommand();
            redoStack.push(textCommand);
            getStacksStatus();
        }
    }

    public void redoCommand(){
        if(redoStack.isEmpty()){
            System.out.println("Nothing to redo!!!");
        }else {
            this.textCommand = redoStack.pop();
            textCommand.redoCommand();
            undoStack.push(textCommand);
            getStacksStatus();
        }
    }

    private void getStacksStatus(){
        System.out.println("Undo stack: \n");
        System.out.println(undoStack);
        System.out.println("Redo stack: \n");
        System.out.println(redoStack);
    }

}
