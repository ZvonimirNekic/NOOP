package zad_1;

/**
 * Klasa Food predstavlja pojedinačnu hranu s nazivom, cijenom i ID-om.
 */
public class Food {
    private double price;
    private String foodName;
    private int foodID;
    private static int foodCounter = 101; // Jedinstveni ID za svaki Food objekt

    public Food(String foodName, double price) {
        this.foodName = foodName;
        this.price = price;
        this.foodID = foodCounter++;
    }

    @Override
    public String toString() {
        return "Food{" +
                "price=" + price +
                ", foodName='" + foodName + '\'' +
                ", foodID=" + foodID +
                '}';
    }
}