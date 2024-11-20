package pckg_wildcards;

public class BestUser extends User{
    public BestUser(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "BestUser{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void performSomething() {
        super.performSomething();
        System.out.println("Can perform something additional...");
        System.out.println(this.getClass().getSimpleName() + " is performing something additional!");
    }
}
