package pkcg_classic;

import java.awt.*;

public class CarStore {

    private Car car;
    private String storeName;

    public CarStore(String storeName) {
        this.storeName = storeName;
    }

    public void createCar(String type){

        if(type.equals("SUV")){
            car = new SUVCar();
            runCarMethods();
        }

        if(type.equals("Sedan")){
            car = new SedanCar();
            runCarMethods();
        }

        if(type.equals("Cabrio")){
            car = new Cabrio();
            runCarMethods();
        }


    }

    private void runCarMethods(){
        car.manufactureCar();
        car.assemblyCar();
        car.paintCar(Color.CYAN);
        car.testCar();
        car.deliverCar();
    }

}
