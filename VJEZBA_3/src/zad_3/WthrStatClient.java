package zad_3;

/**
 * Zadatak:
 * Aplikacija prikazuje vremenske podatke u metričkom sustavu (°C, m/s) neovisno o izvoru.
 * Podatke iz metričke i nemetričke vremenske stanice (°F, čvorovi) treba standardizirati
 * koristeći Adapter dizajnerski obrazac za konverziju u metrički sustav.
 */
public class WthrStatClient {

    public static void main(String[] args) {
        // Metrička vremenska stanica
        PrimaryInterface metricStation = new MetricWthrServiceStation();
        metricStation.readTemperatureC();
        metricStation.readWindSpeedMs();
        metricStation.showWeatherData();

        // Nemetrička vremenska stanica s adapterom
        PrimaryInterface nonMetricStationAdapter = new Adapter(new NonMetricWthrServiceAdaptee());
        nonMetricStationAdapter.readTemperatureC();
        nonMetricStationAdapter.readWindSpeedMs();
        nonMetricStationAdapter.showWeatherData();
    }
}
