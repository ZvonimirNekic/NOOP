package zad_3;

/**
 * Adapter koji implementira PrimaryInterface i omogućava konverziju
 * podataka iz nemetričkog u metrički sustav.
 */
public class Adapter implements PrimaryInterface {

    private NonMetricWthrServiceAdaptee wthrService;
    private double temperature;
    private double windSpeed;

    public Adapter(NonMetricWthrServiceAdaptee adaptee) {
        this.wthrService = adaptee;
    }

    @Override
    public void readTemperatureC() {
        wthrService.readTemperatureF();
        this.temperature = convertFahrenheitToCelsius(wthrService.getTempF());
    }

    @Override
    public void readWindSpeedMs() {
        wthrService.readWndSpdInKn();
        this.windSpeed = convertKnotsToMs(wthrService.getWndSpdKn());
    }

    @Override
    public void showWeatherData() {
        System.out.println("\n******************* Weather data *********************");
        System.out.println("Input data from: " + wthrService.getClass().getSimpleName());
        wthrService.showMeasuredData();
        System.out.println("Data after using adapter:");
        System.out.println(toString());
    }

    private double convertFahrenheitToCelsius(double tempF) {
        return (tempF - 32) * 5 / 9;
    }

    private double convertKnotsToMs(double wndSpdKn) {
        return wndSpdKn * 0.514444;
    }

    @Override
    public String toString() {
        return "Adapter [ temperature=" + temperature + "°C, windSpeed=" + windSpeed + " m/s ]";
    }
}
