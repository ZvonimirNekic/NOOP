package zad_3;

import java.util.EventListener;

public interface AddPanelListener extends EventListener {
    void addPanelEventOccurred(String observerName);
}
