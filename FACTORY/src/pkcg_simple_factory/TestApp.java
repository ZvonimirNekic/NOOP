package pkcg_simple_factory;

import pkcg_classic.Car;

public class TestApp {
    public static void main(String[] args) {
        CarStoreNew carStoreNew = new CarStoreNew(new SimpleCarCreator());
        Car car = carStoreNew.createCar("Estate");
        System.out.println(car);
    }
}
