package zad_3;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ObserverDataPanel extends JPanel implements ActionListener {

    private JTextArea textArea;
    private JScrollPane scrollPane;
    private JButton listObserverDataButton;
    private JLabel comoBoxLabel;
    private JComboBox<ObserverInt> observersComboBox;
    private JButton removeObserverButton;
    private ArrayList<ObserverInt> observers;

    private ObserverDataPanelListener observerDataPanelListener;

    public ObserverDataPanel() {
        observers = new ArrayList<>();
        initComps();
        layoutComps();
    }

    public void setObserverDataPanelListener(ObserverDataPanelListener observerDataPanelListener) {
        this.observerDataPanelListener = observerDataPanelListener;
    }

    private void layoutComps() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.LINE_START;
        gbc.insets = new Insets(0, 25, 10, 10);
        add(scrollPane, gbc);
        gbc.gridx = 0;
        gbc.gridy = 1;
        add(listObserverDataButton, gbc);
        gbc.gridx = 0;
        gbc.gridy = 2;
        add(comoBoxLabel, gbc);
        gbc.gridx = 0;
        gbc.gridy = 3;
        add(observersComboBox, gbc);
        gbc.gridx = 0;
        gbc.gridy = 4;
        add(removeObserverButton, gbc);
    }

    private void initComps() {
        textArea = new JTextArea();
        textArea.setEditable(false);
        textArea.setColumns(25);
        textArea.setRows(8);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        scrollPane = new JScrollPane(textArea);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        listObserverDataButton = new JButton("Izlistaj");
        listObserverDataButton.setPreferredSize(new Dimension(100, 25));
        comoBoxLabel = new JLabel("Ukloni s liste");
        observersComboBox = new JComboBox();
        observersComboBox.setPreferredSize(new Dimension(200, 25));
        removeObserverButton = new JButton("Ukloni");
        removeObserverButton.setPreferredSize(new Dimension(100, 25));
        Border innerBorder = BorderFactory.createTitledBorder("Podaci o promatracima");
        Border outerBorder = BorderFactory.createEmptyBorder(5, 5, 5, 5);
        setBorder(BorderFactory.createCompoundBorder(outerBorder, innerBorder));
        listObserverDataButton.addActionListener(this);
        removeObserverButton.addActionListener(this);
    }

    public void setObserverToComboBox(ObserverInt observer){
        observersComboBox.addItem(observer);
        observers.add(observer);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(observerDataPanelListener != null){
            if(e.getSource() == listObserverDataButton) {
                textArea.setText("");
                observerDataPanelListener.listObserversEventOccurred(observers);
            }else if(e.getSource() == removeObserverButton){
                textArea.setText("");
                ObserverInt observer = (ObserverInt) observersComboBox.getSelectedItem();
                observersComboBox.removeItem(observer);
                observers.remove(observer);

            }
        }
    }

    public void appendText(String s) {
        textArea.append(s);
    }
}
