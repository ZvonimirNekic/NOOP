package pckg_wildcards;

import java.util.ArrayList;
import java.util.List;

public class MultiListCLS <E>{

    private final List<E> lista;

    public MultiListCLS() {
        this.lista = new ArrayList<>();
    }

    public void addElement(E element){
        if(lista.contains(element)){
            System.out.println("Element already exists");

        }else {
            this.lista.add(element);
            System.out.println("Added new element: " + element);
        }

    }

    public void removeElement(E element){
        this.lista.remove(element);
    }

    public void listElements1() {   // metoda koja koristi lambda izraze
        this.lista.forEach(e -> {
                System.out.println(e);
        });
    }

    public void listElements2(){        // metoda koja koristi for each petlju i služi za ispis elemenata liste
        for (E element : lista) {
            System.out.println(element);
        }
    }

    //Wildcards - ? - any type of object if we don't know the type
    public void compareListLength(List<?> anotherList){
        int differ = this.lista.size() - anotherList.size();
        if(differ > 0){
            System.out.println("Filed list is larger");
        }else if(differ < 0){
            System.out.println("Another list is larger");
        }else{
            System.out.println("Same size...");
        }
    }



}
