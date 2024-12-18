package pkcg_factory_method;

import pkcg_classic.Car;

import javax.naming.directory.InvalidAttributeValueException;

public abstract class FactoryCarABS {

    public abstract Car produceCar(String type) throws InvalidAttributeValueException;

}
