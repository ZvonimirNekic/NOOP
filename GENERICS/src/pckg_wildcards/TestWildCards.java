package pckg_wildcards;

import java.util.ArrayList;
import java.util.List;

public class TestWildCards {
    public static void main(String[] args) {
        User user1 = new User("Toma");
        User user2 = new User("Franka");
        List<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        MultiListCLS<Integer> multiListCLS = new MultiListCLS<>();
        multiListCLS.addElement(34);
        multiListCLS.addElement(23);
        multiListCLS.addElement(11);
        multiListCLS.listElements1();
        multiListCLS.listElements2();
        multiListCLS.compareListLength(users);
    }
}
