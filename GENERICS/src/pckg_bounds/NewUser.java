package pckg_bounds;

public class NewUser extends User{

    protected NewUser(String name) {
        super(name);
    }

    @Override
    public void performSomething() {
        super.performSomething();
        System.out.println(this.getClass().getSimpleName() + " performing something new!");
    }
}
