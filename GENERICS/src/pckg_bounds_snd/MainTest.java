package pckg_bounds_snd;

public class MainTest {
    public static void main(String[] args) {
        String fst = "Some simple string!";
        String snd = "This one is the second string and it's slightly different...";
        ComapreTWO<String> comapreStrings = new ComapreTWO<>(fst, snd);
        comapreStrings.compareTwo();

        Integer fstInt = 120;
        Integer sndInt = 45;
        ComapreTWO<Integer> compareIntegers = new ComapreTWO<>(fstInt, sndInt);
        compareIntegers.compareTwo();

        User us1 = new User("Ivanka");
        User us2 = new User("Ivana");
        ComapreTWO<User> compareUsers = new ComapreTWO<User>(us1, us2);
        compareUsers.compareTwo();

    }
}
