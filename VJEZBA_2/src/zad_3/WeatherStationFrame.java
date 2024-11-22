package zad_3;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class WeatherStationFrame extends JFrame {

        private WeatherStation weatherStation;
        private ObserverDataPanel observerPanel;
        private ObserverAddPanel observerAddPanel;
        private StateChangePanel stateChangePanel;
        private DisplayPanel displayPanel;
        private ArrayList<Observer> observersToDisplay;

        public WeatherStationFrame() {
            super("WeatherStation");
            this.weatherStation = new WeatherStation();
            observersToDisplay = new ArrayList<>();
            setLocationRelativeTo(null);
            setVisible(true);
            setSize(850, 600);
            setResizable(false);
            initComps();
            layoutComps();
            activateFrame();

            setDefaultCloseOperation(EXIT_ON_CLOSE);
        }

    private void activateFrame() {
            observerAddPanel.setAddPanelListener(new AddPanelListener() {
                @Override
                public void addPanelEventOccurred(String observerName) {
                    Observer newObserver = new Observer(observerName);
                    System.out.println("New observer added: " + newObserver);
                    newObserver.registerToWeatherStation(weatherStation);
                    observerPanel.setObserverToComboBox(newObserver);
                    observersToDisplay.add(newObserver);
                }
            });

            observerPanel.setObserverDataPanelListener(new ObserverDataPanelListener() {
                @Override
                public void listObserversEventOccurred(ArrayList<ObserverInt> observers) {
                    for (ObserverInt observer : observers) {
                        observerPanel.appendText(observer + "\n");
                    }
                }
            });

            stateChangePanel.setStateChangePanelListener(new ChangeStatePanelListener() {
                @Override
                public void changeStatePanelEventOccurred(ChangeStatePanelEvent e) {
                    weatherStation.setTemperature(e.getTemperature());
                    weatherStation.setHumidity(e.getHumidity());
                    weatherStation.setPressure(e.getPressure());
                    weatherStation.notifyObservers();
                    displayPanel.setDisplayText("Temperature: " + weatherStation.getTemperature() + "\n" +
                            "Humidity: " + weatherStation.getHumidity() + "\n" +
                            "Pressure: " + weatherStation.getPressure() + "\n");
                    for(Observer observer : observersToDisplay){
                        SwingUtilities.invokeLater(new Runnable() {
                            @Override
                            public void run() {
                                new ObserverFrame(observer.getName(), weatherStation.getTemperature(), weatherStation.getHumidity(),weatherStation.getPressure());
                            }
                        });
                    }
                }
            });

    }

    private void layoutComps() {
            setLayout(new BorderLayout());
            JPanel leftPanel = new JPanel();
            JPanel rightPanel = new JPanel();
            leftPanel.setLayout(new BorderLayout());
            leftPanel.add(observerAddPanel, BorderLayout.NORTH);
            leftPanel.add(observerPanel, BorderLayout.CENTER);
            rightPanel.setLayout(new BorderLayout());
            rightPanel.add(stateChangePanel, BorderLayout.NORTH);
            rightPanel.add(displayPanel, BorderLayout.CENTER);
            add(rightPanel, BorderLayout.CENTER);
            add(leftPanel, BorderLayout.WEST);

    }

    private void initComps() {
            observerPanel = new ObserverDataPanel();
            observerAddPanel = new ObserverAddPanel();
            stateChangePanel = new StateChangePanel();
            displayPanel = new DisplayPanel();
    }

}
