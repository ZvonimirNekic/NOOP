package zad_3;

import javax.swing.*;

public class TestApp {
    public static void main(String[] args) {
        /*
        Observer promatrac1 = new Observer("Promatrac1");
        Observer promatrac2 = new Observer("Promatrac2");
        WeatherStation ws = new WeatherStation();
        promatrac1.registerToWeatherStation(ws);
        promatrac2.registerToWeatherStation(ws);

        ws.setTemperature(20.0);
        ws.setHumidity(50.0);
        ws.setPressure(1000.0);
        ws.notifyObservers();

         */

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new WeatherStationFrame();
            }
        });
    }
}
