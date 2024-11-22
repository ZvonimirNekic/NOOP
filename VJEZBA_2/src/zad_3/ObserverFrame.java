package zad_3;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class ObserverFrame extends JFrame {
    private String name;
    private double temperature;
    private double humidity;
    private double pressure;

    private JPanel panel;
    private JLabel lblTemperature;
    private JLabel lblHumidity;
    private JLabel lblPressure;
    private JTextField txtTemperature;
    private JTextField txtHumidity;
    private JTextField txtPressure;




    public ObserverFrame(String name, double temperature, double humidity, double pressure) {
        super(name);
        this.name = name;
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        setLocationRelativeTo(null);
        setVisible(true);
        setSize(500, 500);
        setResizable(false);
        initComps();
        layoutComps();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void layoutComps() {
        panel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(10,10,10,10);
        panel.add(lblTemperature, gbc);
        gbc.gridx = 1;
        gbc.gridy = 0;
        panel.add(txtTemperature, gbc);
        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(lblHumidity,gbc);
        gbc.gridx = 1;
        gbc.gridy = 1;
        panel.add(txtHumidity,gbc);
        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(lblPressure,gbc);
        gbc.gridx = 1;
        gbc.gridy = 2;
        panel.add(txtPressure, gbc);
        add(panel);

    }

    private void initComps() {
        panel = new JPanel();
        lblTemperature = new JLabel("Temperature ");
        lblHumidity = new JLabel("Humidity ");
        lblPressure = new JLabel("Pressure ");
        txtTemperature = new JTextField(10);
        txtHumidity = new JTextField(10);
        txtPressure = new JTextField(10);
        txtHumidity.setEditable(false);
        txtPressure.setEditable(false);
        txtTemperature.setEditable(false);
        txtTemperature.setText(Double.toString(temperature));
        txtHumidity.setText(Double.toString(humidity));
        txtPressure.setText(Double.toString(pressure));
        Border innerBorder = BorderFactory.createTitledBorder("Stanje");
        Border outerBorder = BorderFactory.createEmptyBorder(5, 5, 5, 5);
        panel.setBorder(BorderFactory.createCompoundBorder(outerBorder, innerBorder));
    }

}
