package ZAD_1_CALCULATOR;


import ZAD_1_GUI.AppFrame;


import javax.swing.SwingUtilities;

public class MainApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new AppFrame());
    }
}