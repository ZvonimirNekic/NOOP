package com.observer.pckg3_weather1;

public interface ObservableWS {

    void add(Observer observer);
    void remove(Observer observer);
    void notifyAllObservers();
}
