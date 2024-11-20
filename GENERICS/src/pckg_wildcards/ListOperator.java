package pckg_wildcards;

import java.util.List;

public class ListOperator{
    public static void listElements(List<? super AdvancedUser> list){
        list.forEach(System.out::println);
    }
}
