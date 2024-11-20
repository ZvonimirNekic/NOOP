package pckg_gui_calculator.load_strategies;

import pckg_gui_calculator.CalculationFormData;

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class LoadBinStrategy implements LoadDataStrategy<CalculationFormData> {

    @Override
    public List<CalculationFormData> loadDataFromFile(String filePath) {
        List<CalculationFormData> loadedData = new ArrayList<>();
        try (FileInputStream fis = new FileInputStream(new File(filePath))) {
            ObjectInputStream ois = new ObjectInputStream(fis);
            loadedData = (List<CalculationFormData>) ois.readObject();
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "File not found or unsupported.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Unexpected data structure in bin file", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error reading file", "Error", JOptionPane.ERROR_MESSAGE);
        }

        return loadedData;
    }
}
