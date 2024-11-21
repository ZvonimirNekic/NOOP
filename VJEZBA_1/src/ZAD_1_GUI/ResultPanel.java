package ZAD_1_GUI;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class ResultPanel extends JPanel {

    private JTextField resultField;
    private JTextArea allResultsArea;
    private JButton clearResultsButton;
    private ClearResultsListener clearResultsListener;

    public ResultPanel() {
        // Inicijalizacija komponenti
        initComponents();
        // Postavljanje rasporeda
        layoutComponents();
        // Aktivacija komponenti
        activateComponents();
    }

    private void initComponents() {
        // Tekstualno polje za trenutni rezultat
        resultField = new JTextField(20);
        resultField.setEditable(false);

        // Tekstualno područje za sve rezultate
        allResultsArea = new JTextArea(10, 30);
        allResultsArea.setEditable(false);

        // Gumb "Obriši sve rezultate"
        clearResultsButton = new JButton("Obriši sve rezultate");

        // Postavljanje okvira i naslova
        Border innerBorder = BorderFactory.createTitledBorder("Rezultati");
        Border outerBorder = BorderFactory.createEmptyBorder(10, 10, 10, 10);
        setBorder(BorderFactory.createCompoundBorder(outerBorder, innerBorder));
    }

    private void layoutComponents() {
        setLayout(new BorderLayout());

        // Gornji panel za trenutni rezultat
        JPanel topPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        topPanel.add(new JLabel("Trenutni rezultat:"));
        topPanel.add(resultField);

        // Donji panel za gumb "Obriši sve rezultate"
        JPanel bottomPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        bottomPanel.add(clearResultsButton);

        // Dodavanje komponenti u glavni panel
        add(topPanel, BorderLayout.NORTH);
        add(new JScrollPane(allResultsArea), BorderLayout.CENTER);
        add(bottomPanel, BorderLayout.SOUTH);
    }

    private void activateComponents() {
        // Slušač za gumb "Obriši sve rezultate"
        clearResultsButton.addActionListener(e -> {
            if (clearResultsListener != null) {
                clearResultsListener.clearResultsEventOccurred();
            }
        });
    }

    public void setResultTextField(double result) {
        resultField.setText(String.valueOf(result));
    }

    public void setAllResultTextField(float firstNumber, float secondNumber, double result, String operation) {
        String opSymbol;
        switch (operation) {
            case "Zbrajanje":
                opSymbol = "+";
                break;
            case "Oduzimanje":
                opSymbol = "-";
                break;
            case "Množenje":
                opSymbol = "*";
                break;
            case "Dijeljenje":
                opSymbol = "/";
                break;
            case "Potenciranje":
                opSymbol = "^";
                break;
            case "Prosjek":
                opSymbol = "avg";
                break;
            default:
                opSymbol = "?";
                break;
        }
        // Dodavanje rezultata u tekstualno područje
        allResultsArea.append(String.format("%.2f %s %.2f = %.2f%n", firstNumber, opSymbol, secondNumber, result));
    }

    public void clearAllResults() {
        // Brisanje sadržaja tekstualnog polja i područja
        resultField.setText("");
        allResultsArea.setText("");
    }

    public void setClearResultsListener(ClearResultsListener listener) {
        this.clearResultsListener = listener;
    }

    // Sučelje za slušača događaja brisanja rezultata
    public interface ClearResultsListener {
        void clearResultsEventOccurred();
    }
}
