package pckg_wildcards;

public class AdvancedUser extends BestUser{
    public AdvancedUser(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "AdvancedUser{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void performSomething() {
        super.performSomething();
    }
}
