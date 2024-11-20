package pckg_wildcards;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestLowerBound {
    public static void main(String[] args) {
        User user = new User("Zorana");
        BestUser bestUser = new BestUser("Pepo");
        AdvancedUser advancedUser = new AdvancedUser("Mara");
        SuperUser superUser = new SuperUser("Čolak");
        User[] users = {user, bestUser, advancedUser, superUser};
        List<User> userList = new ArrayList<>(Arrays.asList(users));
        ListOperator.listElements(userList);
        SuperUser[] superUsers = {new SuperUser("Dino"), new SuperUser("David")};
        List<SuperUser> superUserList = new ArrayList<>(Arrays.asList(superUsers));
        //ListOperator.listElements(superUserList);

    }
}
