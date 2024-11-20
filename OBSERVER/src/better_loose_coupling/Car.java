package better_loose_coupling;

public class Car {
    private final Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void driveCar() {
        engine.start();
        System.out.println("Driving the car: " +engine.getClass().getSimpleName());
    }
}
