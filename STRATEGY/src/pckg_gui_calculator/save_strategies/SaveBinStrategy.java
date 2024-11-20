package pckg_gui_calculator.save_strategies;

import pckg_gui_calculator.CalculationFormData;

import java.io.*;
import java.util.List;

public class SaveBinStrategy implements SaveDataStrategy<CalculationFormData> {

    @Override
    public void saveDataToFile(String filePath, List<CalculationFormData> data) {
        try (FileOutputStream fos = new FileOutputStream(new File(filePath))){
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(data);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}