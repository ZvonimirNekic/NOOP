package com.observer.pckg4_weather2;

public interface ObservableInt {
    void addObserver(ObserverInt observer);
    void removeObserver(ObserverInt observer);
    void  notifyAllObservers();
}
