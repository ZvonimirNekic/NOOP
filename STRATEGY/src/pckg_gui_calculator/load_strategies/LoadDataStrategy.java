package pckg_gui_calculator.load_strategies;

import java.util.List;

public interface LoadDataStrategy <E> {
    List<E> loadDataFromFile(String filePath);
}
