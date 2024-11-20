package pckg_adapter1_fst_example;

import java.util.Enumeration;
import java.util.StringTokenizer;

public class AppTest {
    public static void main(String[] args) {

        //ADAPTER
        // programiranje prema sučelju | kompozicija ispred nasljeđivanja

//        ArrayList<String> stringList= new ArrayList<>();
//        stringList.addAll(List.of("a", "b", "c", "d"));
//        Client<String> clientFirst = new Client<>(stringList.iterator());
////        clientFirst.someInfo();
//        clientFirst.removeFetchedElement();
//        System.out.println("After removal.....");
//        clientFirst.someInfo();
//
//        System.out.println(stringList);

        Enumeration stringTokenizer = new StringTokenizer("This is some string for tokenization.");
        AdapterEnumeration<String> adapterEnumeration = new AdapterEnumeration<String>(stringTokenizer);

        Client<String> sndClient = new Client<>(adapterEnumeration);
//        sndClient.someInfo();
        sndClient.removeFetchedElement();
        sndClient.someInfo();

    }
}
