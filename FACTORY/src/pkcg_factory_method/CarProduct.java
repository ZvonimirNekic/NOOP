package pkcg_factory_method;

import java.awt.*;

public abstract class CarProduct {

    protected String type;

    public abstract void manufactureCar();
    public abstract void assemblyCar();
    public abstract void paintCar(Color color);
    public abstract void testCar();


    public void deliverCar() {
        System.out.println("Car:  " + getClass().getSimpleName() + "  is delivered....");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }

}
