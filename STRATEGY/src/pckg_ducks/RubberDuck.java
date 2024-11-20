package pckg_ducks;

public class RubberDuck extends Duck{
    @Override
    protected void display() {
        System.out.println("This is a Rubber Duck");
    }

    @Override
    protected void swim() {
        System.out.println("Can only float :\\");
    }
}
