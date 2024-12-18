package pkcg_simple_factory;

import pkcg_classic.Car;

import javax.naming.directory.InvalidAttributeValueException;

public class CarStoreNew {
    private SimpleCarCreator simpleCarCreator;

    public CarStoreNew(SimpleCarCreator simpleCarCreator) {
        this.simpleCarCreator = simpleCarCreator;
    }

    public Car createCar(String type){
        try {
            return simpleCarCreator.createCar(type);
        } catch (InvalidAttributeValueException eave) {
            System.out.println("Not supported Car type!!");
        }
        return null;
    }

}
