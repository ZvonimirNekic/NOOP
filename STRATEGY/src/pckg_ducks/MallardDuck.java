package pckg_ducks;

public class MallardDuck extends Duck{
    @Override
    protected void display() {
        System.out.println("This is a Mallard Duck");
    }

    @Override
    protected void swim() {
        System.out.println("Mallard Duck swimming...");
    }

    public Duck getDuck(){
        return this;
    }
}
