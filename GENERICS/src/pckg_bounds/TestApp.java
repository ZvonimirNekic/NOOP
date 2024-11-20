package pckg_bounds;

public class TestApp {
    public static void main(String[] args) {

        Integer[] integers = {1, 2, 3};
        BestUser[] users = {new BestUser("Besty"), new BestUser("Plain Jane"), new BestUser("Newbie")};
        User[] users2 = {new BestUser("Besty"), new User("Plain Jane"), new NewUser("Newbie")};
        SimpleClass<BestUser> bestUserSimpleClass = new SimpleClass<BestUser>(users);
        bestUserSimpleClass.performSomething();

        SimpleClass<NewUser> newUserSimpleClass = new SimpleClass<>();
        System.out.println("------------------");
        SimpleClass<User> userSimpleClass = new SimpleClass<>(users2);
        userSimpleClass.performSomething();
    }
}
