package ZAD_1_GUI;

import ZAD_1_CALCULATOR.*;
import javax.swing.*;
import java.awt.*;

public class AppFrame extends JFrame {
    private FormPanel formPanel;
    private ResultPanel resultPanel;
    private SimpleCalculator calculator;

    public AppFrame() {
        super("SimpleCalculator");

        // Inicijalizacija komponenti
        calculator = new SimpleCalculator();
        formPanel = new FormPanel();
        resultPanel = new ResultPanel();

        // Postavljanje glavnog okvira
        setLayout(new BorderLayout());
        add(formPanel, BorderLayout.WEST);
        add(resultPanel, BorderLayout.CENTER);

        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Aktivacija događaja i prikaz okvira
        activateFrame();
        setVisible(true);
    }

    private void activateFrame() {
        // Postavljanje slušača za događaje iz FormPanel-a
        formPanel.setFormListener(event -> {
            CalculationStrategy strategy;
            String operation = event.getOperation();
            float a = event.getFirstNumber();
            float b = event.getSecondNumber();
            double result;

            try {
                // Odabir strategije na temelju odabrane operacije
                switch (operation) {
                    case "Zbrajanje":
                        strategy = new AddStrategy();
                        break;
                    case "Oduzimanje":
                        strategy = new SubsStrategy();
                        break;
                    case "Množenje":
                        strategy = new MultiplyStrategy();
                        break;
                    case "Dijeljenje":
                        if (b == 0) {
                            throw new ArithmeticException("Dijeljenje s nulom nije dozvoljeno.");
                        }
                        strategy = new DivisionStrategy();
                        break;
                    case "Potenciranje":
                        strategy = new PowStrategy();
                        b = (int) b; // Kastanje eksponenta u cijeli broj
                        break;
                    case "Prosjek":
                        strategy = new AverageStrategy();
                        break;
                    default:
                        strategy = new AddStrategy();
                        break;
                }

                // Postavljanje strategije i izvođenje izračuna
                calculator.setStrategy(strategy);
                result = calculator.performCalculation(a, b);

                // Ažuriranje rezultata u ResultPanel-u
                resultPanel.setResultTextField(result);
                resultPanel.setAllResultTextField(a, b, result, operation);

            } catch (ArithmeticException ex) {
                // Prikaz poruke o pogrešci
                JOptionPane.showMessageDialog(AppFrame.this, ex.getMessage(), "Greška", JOptionPane.ERROR_MESSAGE);
            }
        });

        // Postavljanje slušača za gumb "Obriši sve rezultate"
        resultPanel.setClearResultsListener(() -> {
            resultPanel.clearAllResults();
        });
    }
}
