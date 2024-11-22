package zad_3;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Klasa za simulaciju metričke vremenske stanice koja implementira
 * PrimaryInterface.
 */
public class MetricWthrServiceStation implements PrimaryInterface {

    private double temperature;
    private double windSpeed;

    @Override
    public void readTemperatureC() {
        this.temperature = ThreadLocalRandom.current().nextDouble(-20, 48);
    }

    @Override
    public void readWindSpeedMs() {
        this.windSpeed = ThreadLocalRandom.current().nextDouble(0, 35);
    }

    @Override
    public void showWeatherData() {
        System.out.println("****************** Weather data ******************");
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "MetricWthrServiceStation [ temp=" + temperature + "°C, windSpeed=" + windSpeed + " m/s ]";
    }
}
