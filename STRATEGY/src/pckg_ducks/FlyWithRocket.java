package pckg_ducks;

public class FlyWithRocket implements Flyable{
    @Override
    public void fly() {
        System.out.println("Flying using some rockets!");
    }
}