package com.observer.pckg3_weather1;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements ObservableWS{

    private double temperature;
    private double pressure;
    private double humidity;

    private final List<Observer> observers;

    public WeatherStation(double temperature, double pressure, double humidity){
        this.humidity = humidity;
        this.temperature = temperature;
        this.humidity = humidity;
        this.observers = new ArrayList<>();
    }

    @Override
    public void add(Observer observer) {
        if (observers.contains(observer)){
            System.out.println("This observer is already in observable list!");
        } else {
            observers.add(observer);
            System.out.println("New observer added to a list: " + observer);
        }
    }

    @Override
    public void remove(Observer observer) {
        if (observers.contains(observer)){
            observers.remove(observer);
            System.out.println("Observer removed from list!");
        } else {
            System.out.println("Can't remove observer that's not in the list!");
        }
    }

    @Override
    public void notifyAllObservers() {
        if (observers.isEmpty()){
            System.out.println("No one to notify - the list is empty!");
        } else {
            for (Observer observer: observers){
                observer.update();
            }
        }

    }

    public void setStateWeatherData(double p, double t, double h){
        this.humidity = h;
        this.pressure = p;
        this.temperature = t;
        System.out.println("Weather data changed...");
        notifyAllObservers();
    }

    public double getTemperature() {
        return temperature;
    }

    public double getPressure() {
        return pressure;
    }

    public double getHumidity() {
        return humidity;
    }
}
