package pckg_intro;

import java.util.ArrayList;

public class AppIntro {
    public static void main(String[] args) {
        ArrayList<User> lst = new ArrayList();
//        lst.add(100);
//        lst.add("Something");
//        lst.add(23.57);
//        lst.add(2E11);
        lst.add(new User("Zoki"));
        printList(lst);

        listElementsFromList(lst);

        System.out.println(new User("Ime1"));
    }

    private static void printList(ArrayList lst){
        int len = lst.size();
        System.out.println("-----------------------");
        for (int i = 0; i < len; i++){
            System.out.println(lst.get(i));
        }
        System.out.println("-----------------------");
    }

    private static void listElementsFromList(ArrayList<User> lst) {
        for (User user: lst){
            System.out.println(user);
        }
    }
}
