package zad_1;

public class Item {

    private String itemName;  // Naziv proizvoda
    private String itemCat;   // Kategorija proizvoda

    public Item(String name, String category) {
        this.itemName = name;
        this.itemCat = category;
    }

    @Override
    public String toString() {
        return "Item [itemName=" + itemName + ", itemCat=" + itemCat + "]";
    }
}
