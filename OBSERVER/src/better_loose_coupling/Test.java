package better_loose_coupling;

public class Test {
    public static void main(String[] args) {
        Engine engine = new CombustionEngine();
        Car car = new Car(engine);
        car.driveCar();

        engine = new ElectricEngine();
        car = new Car(engine);
        car.driveCar();
    }
}
