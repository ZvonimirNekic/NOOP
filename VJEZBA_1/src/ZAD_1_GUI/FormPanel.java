package ZAD_1_GUI;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class FormPanel extends JPanel {

    private JTextField firstNumberField;
    private JTextField secondNumberField;
    private JComboBox<String> operationComboBox;
    private JButton calculateButton;
    private FormPanelListener formListener;

    public FormPanel() {
        // Inicijalizacija komponenti
        initComponents();
        // Postavljanje rasporeda
        layoutComponents();
        // Aktivacija komponenti
        activateComponents();
    }

    private void initComponents() {
        // Tekstualna polja za unos brojeva
        firstNumberField = new JTextField(10);
        secondNumberField = new JTextField(10);

        // Padajući izbornik za odabir operacije
        operationComboBox = new JComboBox<>(new String[]{
                "Zbrajanje", "Oduzimanje", "Množenje", "Dijeljenje", "Potenciranje", "Prosjek"
        });

        // Gumb "Izračunaj"
        calculateButton = new JButton("Izračunaj");

        // Postavljanje okvira i naslova
        Border innerBorder = BorderFactory.createTitledBorder("Unos");
        Border outerBorder = BorderFactory.createEmptyBorder(10, 10, 10, 10);
        setBorder(BorderFactory.createCompoundBorder(outerBorder, innerBorder));
    }

    private void layoutComponents() {
        setLayout(new GridBagLayout());
        GridBagConstraints gc = new GridBagConstraints();

        // Prvi redak - "Prvi broj" labela i polje
        gc.gridx = 0;
        gc.gridy = 0;
        gc.anchor = GridBagConstraints.LINE_END;
        gc.insets = new Insets(5, 5, 5, 5);
        add(new JLabel("Prvi broj:"), gc);

        gc.gridx++;
        gc.anchor = GridBagConstraints.LINE_START;
        add(firstNumberField, gc);

        // Drugi redak - "Drugi broj" labela i polje
        gc.gridx = 0;
        gc.gridy++;
        gc.anchor = GridBagConstraints.LINE_END;
        add(new JLabel("Drugi broj:"), gc);

        gc.gridx++;
        gc.anchor = GridBagConstraints.LINE_START;
        add(secondNumberField, gc);

        // Treći redak - "Operacija" labela i combo box
        gc.gridx = 0;
        gc.gridy++;
        gc.anchor = GridBagConstraints.LINE_END;
        add(new JLabel("Operacija:"), gc);

        gc.gridx++;
        gc.anchor = GridBagConstraints.LINE_START;
        add(operationComboBox, gc);

        // Četvrti redak - Gumb "Izračunaj"
        gc.gridx = 1;
        gc.gridy++;
        gc.anchor = GridBagConstraints.CENTER;
        add(calculateButton, gc);
    }

    private void activateComponents() {
        calculateButton.addActionListener(e -> {
            String firstNumberStr = firstNumberField.getText();
            String secondNumberStr = secondNumberField.getText();
            String operation = (String) operationComboBox.getSelectedItem();

            try {
                float firstNumber = Float.parseFloat(firstNumberStr);
                float secondNumber = Float.parseFloat(secondNumberStr);

                // Validacija unosa za potenciranje
                if ("Potenciranje".equals(operation) && secondNumber % 1 != 0) {
                    JOptionPane.showMessageDialog(this, "Drugi broj mora biti cijeli broj za potenciranje!", "Greška", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                // Prosljeđivanje događaja slušaču
                if (formListener != null) {
                    FormPanelEvent event = new FormPanelEvent(this, firstNumber, secondNumber, operation);
                    formListener.formPanelEventOccurred(event);
                }
            } catch (NumberFormatException ex) {
                // Prikaz poruke o pogrešci za nevažeći unos
                JOptionPane.showMessageDialog(this, "Molimo unesite ispravne brojeve.", "Greška", JOptionPane.ERROR_MESSAGE);
            }
        });
    }

    public void setFormListener(FormPanelListener listener) {
        this.formListener = listener;
    }
}
