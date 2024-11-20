package com.observer.pckg4_weather2;

import java.util.Arrays;

public class MobileObserverApp implements ObserverInt, Display{

    private float[] valuesToDisplay;

    @Override
    public void update(float t, float p, float h) {
        valuesToDisplay = new float[]{t, p, h};
        display();
    }

    @Override
    public void register(ObservableInt observable) {
        observable.addObserver(this);
    }

    @Override
    public void unregister(ObservableInt observable) {
        observable.removeObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Displaying values:");
        System.out.println(Arrays.toString(valuesToDisplay));
    }

}
