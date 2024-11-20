package pckg_gui_calculator.save_strategies;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class SaveTxtStrategy implements SaveDataStrategy<String>{

    @Override
    public void saveDataToFile(String filePath, List<String> data) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(new File(filePath)))) {
            for (String line : data) {
                bw.write(line);
                bw.newLine();
            }
            System.out.println("Data saved as text to file: " + filePath);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
