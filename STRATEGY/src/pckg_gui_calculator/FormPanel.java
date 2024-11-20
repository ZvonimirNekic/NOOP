package pckg_gui_calculator;

import pckg_gui_calculator.calc_strategies.*;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormPanel extends JPanel {

    private JTextField fstNumField;
    private JTextField sndNumField;
    private JTextField resultField;

    private JComboBox<CalculationStrategy> operationBox;
    private JButton confirmButton;

    private FormPanelListener formPanelListener;


    public FormPanel(){

        Dimension dims = getPreferredSize();
        dims.height = 220;
        setPreferredSize(dims);
        Border outer = BorderFactory.createEmptyBorder(5,5,5,5);
        Border inner = BorderFactory.createTitledBorder("Calculation form");
        Border border = BorderFactory.createCompoundBorder(outer, inner);
        setBorder(border);

        initComps();
        layoutComps();
        activateForm();
    }

    public void initComps(){
        fstNumField = new JTextField(10);
        sndNumField = new JTextField(10);
        resultField = new JTextField(10);
        operationBox = new JComboBox<>();

        DefaultComboBoxModel<CalculationStrategy> operationBoxModel = new DefaultComboBoxModel<>();
        operationBoxModel.addElement(new AddCalcStrategy());
        operationBoxModel.addElement(new SubtractCalcStrategy());
        operationBoxModel.addElement(new MultiplyCalcStrategy());
        operationBoxModel.addElement(new DivideCalcStrategy());

        operationBox.setModel(operationBoxModel);
        operationBox.setSelectedIndex(-1); //da nista ne pokazuje na pocetku

        confirmButton = new JButton("Calculate");
    }

    public void layoutComps(){
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.gridx = 0;
        gbc.gridy = 0;

        gbc.anchor = GridBagConstraints.FIRST_LINE_END;
        add(new JLabel("First number: "), gbc);

        gbc.gridx++;
        gbc.anchor = GridBagConstraints.FIRST_LINE_START;
        add(fstNumField, gbc);


        gbc.gridx = 0;
        gbc.gridy++;

        add(Box.createVerticalStrut(10), gbc);

        gbc.gridy++;
        gbc.anchor = GridBagConstraints.FIRST_LINE_END;
        add(new JLabel("Second number: "), gbc);

        gbc.gridx++;
        gbc.anchor = GridBagConstraints.FIRST_LINE_START;
        add(sndNumField, gbc);


        gbc.gridx++;
        add(Box.createHorizontalStrut(40), gbc);

        gbc.gridx++;

        gbc.anchor = GridBagConstraints.FIRST_LINE_END;
        add(new JLabel("Choose operation: "), gbc);

        gbc.gridx++;
        gbc.anchor = GridBagConstraints.FIRST_LINE_START;
        add(operationBox, gbc);

        gbc.gridx = 1;
        gbc.gridy++;

        add(Box.createVerticalStrut(10), gbc);

        gbc.gridy++;
        add(confirmButton, gbc);

        gbc.gridx+=2;
        gbc.anchor = GridBagConstraints.FIRST_LINE_END;
        add(new JLabel("Result: "), gbc);

        gbc.gridx++;
        gbc.anchor = GridBagConstraints.FIRST_LINE_START;
        add(resultField, gbc);
    }


    public void setFormPanelListener(FormPanelListener formPanelListener){
        this.formPanelListener = formPanelListener;
    }


    public void activateForm(){
        confirmButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (fstNumField.getText().isEmpty() || sndNumField.getText().isEmpty()){
                    JOptionPane.showMessageDialog(FormPanel.this, "Please enter numbers", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                double fst;
                double snd;
                try {
                    fst = Double.parseDouble(fstNumField.getText());
                    snd = Double.parseDouble(sndNumField.getText());
                } catch (NumberFormatException ex){
                    JOptionPane.showMessageDialog(FormPanel.this, "Please enter valid numbers", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }


                CalculationStrategy strategy = (CalculationStrategy) operationBox.getSelectedItem();
                if (strategy == null){
                    JOptionPane.showMessageDialog(FormPanel.this, "Please choose operation", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                double result = strategy.performCalculation(fst, snd);

                resultField.setText(String.valueOf(result));

                CalculationFormData calculationRecord = new CalculationFormData(fst, snd, result, strategy);
                if (formPanelListener != null){
                    formPanelListener.formPanelEventOccured(calculationRecord);
                }

                resetForm();
            }
        });

    }

    private void resetForm() {
        fstNumField.setText("");
        sndNumField.setText("");
        resultField.setEnabled(false);
        operationBox.setSelectedIndex(-1);
        fstNumField.requestFocus();
    }

    public void clearForm() {
        fstNumField.setText("");
        sndNumField.setText("");
        resultField.setText("");
        operationBox.setSelectedIndex(-1);
        resultField.setText("");
        fstNumField.requestFocus();
    }

}
