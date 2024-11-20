package com.observer.pckg4_weather2;

public interface ObserverInt {
    void update(float t, float p, float h);
    void register(ObservableInt observable);
    void unregister(ObservableInt observable);
}
