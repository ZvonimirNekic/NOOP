package pkcg_factory_method;

import pkcg_classic.Car;

import javax.naming.directory.InvalidAttributeValueException;
import java.awt.*;

public class CarFactoryUK extends FactoryCarABS{
    private Car car;

    @Override
    public Car produceCar(String type) throws InvalidAttributeValueException {
        if(type.equals("SUV_UK")){
            car = new SUVCarUK();
            runCarMethods();
        }else if(type.equals("Sedan_UK")){
            car = new SedanCarUK();
            runCarMethods();
        }else if(type.equals("Cabrio_UK")){
            car = new CabrioUK();
            runCarMethods();
        }else if(type.equals("ElectricCar_UK")){
            car = new ElectricCarUK();
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
