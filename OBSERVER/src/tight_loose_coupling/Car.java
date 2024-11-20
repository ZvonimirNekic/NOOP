package tight_loose_coupling;

public class Car {
    private Engine engine;

    public Car (Engine engine){
        this.engine = engine;
    }

    public void driveCar(){
        engine.startEngine();
        System.out.println("Car is driving");
    }
}
