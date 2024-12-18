package pkcg_classic;

import java.awt.*;

public abstract class Car {

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
