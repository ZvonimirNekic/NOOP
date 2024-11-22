package zad_3;

import javax.swing.*;
import javax.swing.border.Border;

public class DisplayPanel extends JPanel {

    private JTextArea textArea;
    private JScrollPane scrollPane;


    public DisplayPanel() {
        initComps();
        layoutComps();
    }

    private void layoutComps() {
        add(scrollPane);
    }

    private void initComps() {
        textArea = new JTextArea();
        textArea.setEditable(false);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setColumns(30);
        textArea.setRows(18);
        scrollPane = new JScrollPane(textArea);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        Border innerBorder = BorderFactory.createTitledBorder("Prikaz");
        Border outerBorder = BorderFactory.createEmptyBorder(5, 5, 5, 5);
        setBorder(BorderFactory.createCompoundBorder(outerBorder, innerBorder));
    }

    public void setDisplayText(String s) {
        textArea.setText(s);
    }
}
