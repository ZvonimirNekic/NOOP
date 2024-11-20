package pckg_bounds;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SimpleClass <T extends User> {

    private final List<T> users;

    public SimpleClass(){
        this.users = new ArrayList<>();
    }

    public SimpleClass(T[] arrUsrs){
        this.users = Arrays.asList(arrUsrs);
    }

    public void performSomething(){
        if(users.isEmpty()){
            System.out.println("There are no users to perform anything!");
        } else {
            for (T user : users){
                user.performSomething();
            }
        }
    }
}
