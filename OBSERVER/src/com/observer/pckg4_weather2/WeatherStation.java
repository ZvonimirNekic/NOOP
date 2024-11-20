package com.observer.pckg4_weather2;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements ObservableInt{

    private float temperature;
    private float pressure;
    private float humidity;
    private boolean isChanged;
    private final List<ObserverInt> observers;

    public WeatherStation(float t, float p, float h){
        this.temperature = t;
        this.pressure = p;
        this.humidity = h;
        this.observers = new ArrayList<>();
    }

    @Override
    public void addObserver(ObserverInt observer) {
        this.observers.add(observer);
        System.out.println("Observer added: " + observer);
    }

    @Override
    public void removeObserver(ObserverInt observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyAllObservers() {
        for (ObserverInt o: observers){
            o.update(temperature, pressure, humidity);
        }
    }



    public float getTemperature() {
        return temperature;
    }

    public float getPressure() {
        return pressure;
    }

    public float getHumidity() {
        return humidity;
    }
}
