package pkcg_simple_factory;

import pkcg_classic.*;

import javax.naming.directory.InvalidAttributeValueException;
import java.awt.*;

public class SimpleCarCreator {
    private Car car;

    public Car createCar(String type) throws InvalidAttributeValueException {

        if(type.equals("SUV")){
            car = new SUVCar();
            runCarMethods();
        }else if(type.equals("Sedan")){
            car = new SedanCar();
            runCarMethods();
        }else if(type.equals("Cabrio")){
            car = new Cabrio();
            runCarMethods();
        }else if(type.equals("ElectricCar")){
            car = new ElectricCar();
            runCarMethods();
        }else {
            throw new InvalidAttributeValueException("Not supported car type!");
        }
        return car;
    }

    private void runCarMethods(){
        car.manufactureCar();
        car.assemblyCar();
        car.paintCar(Color.CYAN);
        car.testCar();
        car.deliverCar();
    }


}
