package zad_3;

public class Observer implements WeatherStationRegistration {
    private int id;
    private String name;
    private static int cntID = 10;
    private double temperature;
    private double humidity;
    private double pressure;

    public Observer(String name) {
        this.name = name;
    }


    @Override
    public void update(double temp, double hum, double press) {
        this.temperature = temp;
        this.humidity = hum;
        this.pressure = press;
        System.out.println("Weather parameters changed for observer: " + name + " ...");
        System.out.println("Updated weather params: ");
        System.out.println("Temp: " + temp + ", press: " + press + ", hum: " + hum);
    }

    public String getName() {
        return name;
    }

    @Override
    public void registerToWeatherStation(WeatherStationObservable wso) {
        wso.addObserver(this);
    }

    @Override
    public void unregisterFromWeatherStation(WeatherStationObservable wso) {
        wso.removeObserver(this);
    }

    @Override
    public String toString() {
        return "Observer{" +
                "name='" + name + '\'' +
                '}';
    }
}
