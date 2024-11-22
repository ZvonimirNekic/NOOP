package zad_1;

public class Customer implements CustObserverInt {

    private String userName;  // Ime korisnika
    private int id;           // ID korisnika
    private static int cnt = 1; // Brojač za ID

    public Customer(String userName) {
        this.id = cnt++;
        this.userName = userName;
    }

    @Override
    public void update(Item itm, String storeName) {
        System.out.println("Notification for customer:");
        System.out.println(toString());
        System.out.println("****************** " + storeName + " *********************");
        System.out.println("Item: " + itm.toString());
        System.out.println("Is now available in our store....");
        System.out.println("////////////////////////////////////////////////////////////\n");
    }

    @Override
    public String toString() {
        return "Customer [userName=" + userName + ", id=" + id + "]";
    }
}
