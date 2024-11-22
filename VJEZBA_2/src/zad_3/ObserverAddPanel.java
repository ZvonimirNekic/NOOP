package zad_3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ObserverAddPanel extends JPanel implements ActionListener{

    private JLabel label;
    private JTextField textField;
    private JButton addButton;

    private AddPanelListener addPanelListener;

    public ObserverAddPanel() {
        initComps();
        layoutComps();
    }

   public void setAddPanelListener(AddPanelListener addPanelListener){
        this.addPanelListener = addPanelListener;
    }

    private void layoutComps() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.LINE_START;
        gbc.insets = new Insets(10, 25, 10, 10);
        add(label, gbc);
        gbc.gridx = 0;
        gbc.gridy = 1;
        add(textField, gbc);
        gbc.gridx = 0;
        gbc.gridy = 2;
        add(addButton, gbc);
    }

    private void initComps() {
        label = new JLabel("Novi promatrac:");
        textField = new JTextField("ImePromatraca");
        addButton = new JButton("Dodaj na listu");
        textField.setColumns(20);
        addButton.setSize(new Dimension(100, 25));
        addButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Action event occurred...");
        if(e.getSource() == addButton){
            System.out.println("Add panel listener not null...");
            addPanelListener.addPanelEventOccurred(textField.getText());
        }
    }
}
