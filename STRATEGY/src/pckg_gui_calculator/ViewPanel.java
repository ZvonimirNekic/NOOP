package pckg_gui_calculator;

import javax.swing.*;
import java.awt.*;

public class ViewPanel extends JPanel {

    private JTextArea textArea;
    private JScrollPane scrollPane;


    public ViewPanel(){
        textArea = new JTextArea();
        textArea.setEditable(false);
        scrollPane = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        setLayout(new BorderLayout());
        add(scrollPane, BorderLayout.CENTER);

    }

    public void addTextToViewPanel(CalculationFormData formRecord) {
        textArea.append(formRecord.toString() + "\n");
    }

    public void clearTextArea() {
        textArea.setText("");
    }

    public String getTextAreaData() {
        return textArea.getText();
    }

    public void addTextToViewPanel(String dataTxt) {
        textArea.append(dataTxt + "\n");
    }
}
