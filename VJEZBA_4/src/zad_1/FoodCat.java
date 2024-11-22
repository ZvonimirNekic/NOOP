package zad_1;

/**
 * Klasa FoodCat predstavlja kategoriju hrane s jedinstvenim ID-om.
 */
public class FoodCat {
    private int id;
    private static int cnt = 1;
    private EnumFoodCat foodCat;

    public FoodCat(EnumFoodCat foodCat) {
        this.foodCat = foodCat;
        this.id = cnt++;
    }

    @Override
    public String toString() {
        return "FoodCat{" +
                "id=" + id +
                ", foodCat=" + foodCat +
                '}';
    }
}
