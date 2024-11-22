package zad_3;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class StateChangePanel extends JPanel{

        private JLabel temperatureLabel;
        private JLabel humidityLabel;
        private JLabel pressureLabel;
        private JTextField temperatureTextField;
        private JTextField humidityTextField;
        private JTextField pressureTextField;
        private JButton changeStateButton;

        private ChangeStatePanelListener stateChangePanelListener;

        public StateChangePanel() {
            initComps();
            layoutComps();
            activateComps();
        }

    private void activateComps() {
            changeStateButton.addActionListener(e -> {
            String temperatureStr = temperatureTextField.getText();
            String humidityStr = humidityTextField.getText();
            String pressureStr = pressureTextField.getText();

            double temperatureDouble;
            double humidityDouble;
            double pressureDouble;

            try{
                temperatureDouble = Double.parseDouble(temperatureStr);
                humidityDouble = Double.parseDouble(humidityStr);
                pressureDouble = Double.parseDouble(pressureStr);
            }catch (NumberFormatException ex){
                JOptionPane.showMessageDialog(StateChangePanel.this, "Unesite broj", "Error", JOptionPane.ERROR_MESSAGE);
                temperatureTextField.setText("");
                humidityTextField.setText("");
                pressureTextField.setText("");
                temperatureTextField.requestFocusInWindow();
                return;
            }

            ChangeStatePanelEvent changeStatePanelEvent = new ChangeStatePanelEvent(this, temperatureDouble, humidityDouble, pressureDouble);
            if(stateChangePanelListener != null){
                stateChangePanelListener.changeStatePanelEventOccurred(changeStatePanelEvent);
            }
        });
    }

    public void setStateChangePanelListener(ChangeStatePanelListener stateChangePanelListener){
            this.stateChangePanelListener = stateChangePanelListener;
        }

        private void layoutComps() {
            setLayout(new GridBagLayout());
            GridBagConstraints gbc = new GridBagConstraints();
            gbc.gridx = 0;
            gbc.gridy = 0;
            gbc.anchor = GridBagConstraints.LINE_START;
            gbc.insets = new Insets(10, 10, 10, 10);
            add(temperatureLabel, gbc);
            gbc.gridx = 1;
            gbc.gridy = 0;
            add(temperatureTextField, gbc);
            gbc.gridx = 0;
            gbc.gridy = 1;
            add(humidityLabel, gbc);
            gbc.gridx = 1;
            gbc.gridy = 1;
            add(humidityTextField, gbc);
            gbc.gridx = 0;
            gbc.gridy = 2;
            add(pressureLabel, gbc);
            gbc.gridx = 1;
            gbc.gridy = 2;
            add(pressureTextField, gbc);
            gbc.gridx = 0;
            gbc.gridy = 3;
            add(changeStateButton, gbc);


        }

        private void initComps() {
            temperatureLabel = new JLabel("Temperatura");
            humidityLabel = new JLabel("Vlaznost");
            pressureLabel = new JLabel("Tlak");
            temperatureTextField = new JTextField();
            temperatureTextField.setPreferredSize(new Dimension(100, 25));
            humidityTextField = new JTextField();
            humidityTextField.setPreferredSize(new Dimension(100, 25));
            pressureTextField = new JTextField();
            pressureTextField.setPreferredSize(new Dimension(100, 25));
            changeStateButton = new JButton("Unesi promjene");
            changeStateButton.setPreferredSize(new Dimension(150, 25));
            Border innerBorder = BorderFactory.createTitledBorder("Stanje");
            Border outerBorder = BorderFactory.createEmptyBorder(5, 5, 5, 5);
            setBorder(BorderFactory.createCompoundBorder(outerBorder, innerBorder));
        }

}
