package tight_loose_coupling;

public class App {

    public static void main(String[] args) {

        Car car1 = new Car(new Engine());
        car1.driveCar();

        Car car2 = new Car(new Engine());
        car2.driveCar();
    }
}
