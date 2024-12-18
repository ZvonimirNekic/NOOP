package pkcg_factory_method;

import pkcg_classic.*;

import javax.naming.directory.InvalidAttributeValueException;
import java.awt.*;

public class CarFactoryEU extends FactoryCarABS{

    private Car car;

    @Override
    public Car produceCar(String type) throws InvalidAttributeValueException {
        if(type.equals("SUV_EU")){
            car = new SUVCarEU();
            runCarMethods();
        }else if(type.equals("Sedan_EU")){
            car = new SedanCarEU();
            runCarMethods();
        }else if(type.equals("Cabrio_EU")){
            car = new CabrioEU();
            runCarMethods();
        }else if(type.equals("ElectricCar_EU")){
            car = new ElectricCarEU();
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
