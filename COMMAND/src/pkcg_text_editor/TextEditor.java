package pkcg_text_editor;

public class TextEditor implements EditorOfText{

    private String text;
    private int startPosition;
    private final StringBuilder stringBuilder;

    public TextEditor() {
        stringBuilder = new StringBuilder();
        startPosition = 0;
    }

    @Override
    public boolean addTextToTextArea(String someText) {
        this.text = someText;
        System.out.println("Before apeend: " + startPosition);

        stringBuilder.append(someText, startPosition, text.length() + startPosition).append("\n");
        System.out.println("After apeend: " + startPosition);
        startPosition = someText.length();
        System.out.println("After upadate: " + startPosition);
        System.out.println("Text added to text area: " + text);
        printAllText();
        return true;
    }
    @Override
    public boolean removeTextFromTextArea(String someText) {
        boolean removed = false;
        if(stringBuilder.indexOf(someText) == -1){
            System.out.println("String: \n +" + someText + "\n is not in textEditor!");
            removed = false;
        }else {
            startPosition = stringBuilder.indexOf(someText);
            stringBuilder.delete(startPosition, someText.length() + startPosition);
            System.out.println("String is deleted!");
            removed = true;
            printAllText();
        }
        return removed;
    }
    @Override
    public void printAllText(){
        String all = stringBuilder.toString();
        System.out.println(all);
    }


}
