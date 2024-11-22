package zad_3;

import java.util.ArrayList;

public abstract class WeatherStationObservable implements ObesrvableInt{

    protected ArrayList<ObserverInt> observers;
    protected WeatherStationObservable() {
        observers = new ArrayList<>();
    }

    protected abstract void addObserver(ObserverInt observer);
    protected abstract void removeObserver(ObserverInt observer);

}
