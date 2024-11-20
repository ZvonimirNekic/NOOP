package pckg_intro;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class AUX_CLS {

    public static void listStringList(ArrayList<String> lst) {
        if (lst.isEmpty()){
            System.out.println("List is empty");
        } else {
            for (String element : lst) {
                System.out.println("element: " + element);
            }
        }

    }

    public static void listIntList(ArrayList<Integer> lst){
        for (Integer intEl : lst){
            System.out.println("element: " + intEl);
        }
    }

    public static void listUserList(ArrayList<User> lst){
        for (User user : lst){
            System.out.println("element: " + user);
        }
    }

    public static <E> void listElements(ArrayList<E> someList) {
        if (someList.isEmpty()) {
            System.out.println("List is empty!");
        } else {
            for (E element : someList) {
                System.out.println(element);
            }
        }
    }

    public static <Q> void listElementsVerSnd (ArrayList<Q> lst){
        Iterator<Q> iter = lst.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }
    }

    public static <K,V> void listMapElements(HashMap<K,V> map) {
        if (map.isEmpty()){
            System.out.println("Map is empty!");
        } else {
            for (Map.Entry<K,V> entry: map.entrySet()){
                System.out.println("Key: " + entry.getKey());
                System.out.println("Value: " + entry.getValue());
            }
        }
    }
}
