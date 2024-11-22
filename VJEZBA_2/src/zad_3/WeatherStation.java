package zad_3;

public class WeatherStation extends WeatherStationObservable{

    private int id;
    private static int cntID = 10;
    private double temperature;
    private double humidity;
    private double pressure;

    public WeatherStation() {
        this.id = cntID++;
        this.temperature = 0.0;
        this.humidity = 0.0;
        this.pressure = 0.0;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    @Override
    public void notifyObservers() {
        for (ObserverInt observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
    }

    @Override
    protected void addObserver(ObserverInt observer) {
        if(observers.contains(observer)){
            System.out.println("Observer already in list...");
        }else {
            System.out.println("Adding observer to notify list: " + observer);
            observers.add(observer);
        }
    }

    @Override
    protected void removeObserver(ObserverInt observer) {
        if(observers.contains(observer)){
            System.out.println("Removed observer: " + observer);
            observers.remove(observer);
        }
    }
}
