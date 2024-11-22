package zad_3;

import java.util.ArrayList;
import java.util.EventListener;

public interface ObserverDataPanelListener extends EventListener {
    void listObserversEventOccurred(ArrayList<ObserverInt> observers);
}
