package pkcg_classic;

import java.awt.*;

public class SUVCar extends Car{

    public SUVCar(){
        this.type = "SUV";
    }

    @Override
    public void manufactureCar() {
        System.out.println("Manufacturing -> " + getClass().getSimpleName());
    }

    @Override
    public void assemblyCar() {
        System.out.println("Assembling all parts for -> " + getClass().getSimpleName());
    }

    @Override
    public void paintCar(Color color) {
        System.out.println("Painting in the color: " + color);
    }

    @Override
    public void testCar() {
        System.out.println("Testing -> " + getClass().getSimpleName());
    }
}
