package zad_3;

public interface WeatherStationRegistration extends ObserverInt{
    void registerToWeatherStation(WeatherStationObservable wso);
    void unregisterFromWeatherStation(WeatherStationObservable wso);
}
