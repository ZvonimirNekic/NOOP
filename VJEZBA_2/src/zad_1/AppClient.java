package zad_1;

/*
 * Zadatak 1:
 * Implementirati web trgovinu u kojoj kupci mogu biti obaviješteni
 * kada proizvod koji trenutno nije dostupan postane raspoloživ.
 */

public class AppClient {

    public static void main(String[] args) {

        OnlineStore store = new OnlineStore("Best online store");

        // Kreiranje kupaca
        Customer cust1 = new Customer("Fst customer");
        Customer cust2 = new Customer("Snd customer");

        // Postavljanje proizvoda
        store.setItemAvailability(new Item("Nike Zoom 500", "Sneakers"));

        // Kupci se prijavljuju za obavijesti
        store.add2AvailLst(cust1);
        store.add2AvailLst(cust2);

        // Obavještavanje kupaca
        store.notifyCsts();
    }
}
