package pckg_gui_calculator.load_strategies;

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class LoadTxtStrategy implements LoadDataStrategy<String>{

    @Override
    public List<String> loadDataFromFile(String filePath) {
        List<String> loadedData = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new FileReader(new File(filePath)))) {
            String line = null;
            while ((line = br.readLine()) != null ){
                loadedData.add(line);
            }
            System.out.println("Finished reading form file " + filePath);
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "File not found or unsupported.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error reading file", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return loadedData;
    }
}
