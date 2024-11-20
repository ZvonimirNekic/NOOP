package pckg_wildcards;

public class SuperUser extends AdvancedUser{
    public SuperUser(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "SuperUser{" +
                "name='" + name + '\'' +
                '}';
    }
    @Override
    public void performSomething() {
        super.performSomething();
    }
}
