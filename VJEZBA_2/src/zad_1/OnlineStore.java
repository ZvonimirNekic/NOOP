package zad_1;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class OnlineStore implements ObservableInt {

    private String storeName;            // Naziv trgovine
    private int storeId;                 // ID trgovine
    private ArrayList<Customer> customers; // Lista kupaca
    private Item itm;                    // Proizvod

    public OnlineStore(String name) {
        this.storeName = name;
        this.storeId = ThreadLocalRandom.current().nextInt(100000);
        customers = new ArrayList<Customer>();
    }

    // Postavljanje dostupnosti proizvoda
    public void setItemAvailability(Item itm) {
        this.itm = itm;
    }

    @Override
    public void add2AvailLst(Customer cst) {
        customers.add(cst);
    }

    @Override
    public void remove4AvailLst(Customer cst) {
        if (!customers.contains(cst)) {
            System.out.println("There is no such customer on our list");
        } else {
            customers.remove(cst);
        }
    }

    @Override
    public void notifyCsts() {
        for (Customer cst : customers) {
            cst.update(itm, storeName);
        }
    }
}
