package pckg_bounds;

public class BestUser extends User{

    protected BestUser(String name) {
        super(name);
    }

    @Override
    public void performSomething() {
        super.performSomething(); //radi metodu od Usera (kojeg extenda)
        System.out.println("This user does it best! " + this.getClass().getSimpleName());

    }
}
