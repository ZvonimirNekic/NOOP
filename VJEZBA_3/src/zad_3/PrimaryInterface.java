package zad_3;

/**
 * Sučelje koje definira metode za čitanje i prikaz vremenskih podataka
 * u metričkom sustavu (°C, m/s).
 */
public interface PrimaryInterface {
    void readTemperatureC();
    void readWindSpeedMs();
    void showWeatherData();
}
