package pkcg_text_editor;

public class BufferTextEditor implements EditorOfText{
    private String text;
    private StringBuffer bufferString;

    public BufferTextEditor()
    {
        bufferString = new StringBuffer();
    }
    @Override
    public boolean removeTextFromTextArea(String someText) {
        int index = bufferString.indexOf(someText);
        if (index != -1) {
            bufferString.delete(index, index + someText.length());
            printAllText();
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean addTextToTextArea(String someText) {
        this.text = someText;
        bufferString.append(text).append("\n");
        System.out.println("Text added to text area: " + text);
        printAllText();
        return true;
    }

    @Override
    public void printAllText() {
        System.out.println(bufferString.toString());
    }
}
