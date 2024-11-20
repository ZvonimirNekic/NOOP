package pckg_adapter1_fst_example;

import java.util.Enumeration;
import java.util.Iterator;

public class AdapterEnumeration<E> implements Iterator<E>{

    private Enumeration<E> enumeration;

    public AdapterEnumeration(Enumeration<E> enumeration){
        this.enumeration = enumeration;
    }

    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public E next() {
        return enumeration.nextElement();
    }

    @Override
    public void remove() {
        System.out.println("Enumeration does not support removal of elements.");
    }
}
