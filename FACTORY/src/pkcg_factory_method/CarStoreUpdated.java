package pkcg_factory_method;

import pkcg_classic.Car;

import javax.naming.directory.InvalidAttributeValueException;

public class CarStoreUpdated {

    private FactoryCarABS factory;

    public void setFactory(FactoryCarABS factory){
        this.factory = factory;
    }

    public Car produceCar(String type) throws InvalidAttributeValueException {
        return factory.produceCar(type);
    }


}
