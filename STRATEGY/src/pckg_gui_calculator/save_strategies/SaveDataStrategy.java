package pckg_gui_calculator.save_strategies;

import java.util.List;

public interface SaveDataStrategy <E> { //bolje parametrizirati na nivou klase jer će izbjeći type casting

    void saveDataToFile(String filePath, List<E> data);
}
