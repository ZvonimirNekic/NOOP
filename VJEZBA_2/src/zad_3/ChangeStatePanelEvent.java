package zad_3;

import java.util.EventObject;

public class ChangeStatePanelEvent extends EventObject {
    /**
     * Constructs a prototypical Event.
     *
     * @param source the object on which the Event initially occurred
     * @throws IllegalArgumentException if source is null
     */
    private double temperature;
    private double humidity;
    private double pressure;
    public ChangeStatePanelEvent(Object source, double temperature, double humidity, double pressure) {
        super(source);
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
    }

    public double getTemperature() {
        return temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public double getPressure() {
        return pressure;
    }
}
