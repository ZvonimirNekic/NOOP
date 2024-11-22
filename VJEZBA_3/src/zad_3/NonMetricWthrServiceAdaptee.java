package zad_3;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Klasa za simulaciju nemetričke vremenske stanice koja daje podatke
 * u Fahrenheitima i čvorovima.
 */
public class NonMetricWthrServiceAdaptee {

    private double tempF;
    private double wndSpdKn;

    public void readTemperatureF() {
        this.tempF = ThreadLocalRandom.current().nextDouble(0, 114);
    }

    public void readWndSpdInKn() {
        this.wndSpdKn = ThreadLocalRandom.current().nextDouble(0, 60);
    }

    public double getTempF() {
        return tempF;
    }

    public double getWndSpdKn() {
        return wndSpdKn;
    }

    public void showMeasuredData() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "NonMetricWthrServiceAdaptee [ tempF=" + tempF + "°F, wndSpdKn=" + wndSpdKn + " knots ]";
    }
}
