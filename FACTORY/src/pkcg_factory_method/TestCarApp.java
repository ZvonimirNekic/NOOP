package pkcg_factory_method;

import pkcg_classic.Car;

import javax.naming.directory.InvalidAttributeValueException;
import java.util.Scanner;

public class TestCarApp {
    private static FactoryCarABS factoryEU = new CarFactoryEU();
    private static FactoryCarABS factoryUK = new CarFactoryUK();
    private static final Scanner scanner = new Scanner(System.in);
    private static CarStoreUpdated carStore = new CarStoreUpdated();

    private static Car car;
    public static void main(String[] args) {

        System.out.println("Please define region EU/UK?");
        String region = scanner.nextLine();
        if(region.equals("EU")){
            carStore.setFactory(factoryEU);
            System.out.println("What type of car do you want to produce?");
            String type = scanner.nextLine();
            try {
                car = carStore.produceCar(type);
                System.out.println(car);
            } catch (InvalidAttributeValueException e) {
                e.printStackTrace();
            }
        }
        if(region.equals("UK")){
            carStore.setFactory(factoryUK);
            System.out.println("What type of car do you want to produce?");
            String type = scanner.nextLine();
            try {
                car = carStore.produceCar(type);
                System.out.println(car);
            } catch (InvalidAttributeValueException e) {
                e.printStackTrace();
            }
        }


    }
}
