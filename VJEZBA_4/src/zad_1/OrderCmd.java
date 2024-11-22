package zad_1;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Klasa OrderCmd implementira IntCommand i predstavlja narudžbu.
 */
public class OrderCmd implements IntCommand {
    private Chef chef;
    private HashMap<EnumFoodCat, ArrayList<Food>> orders;
    private int tableNumber;

    public OrderCmd(Chef chef, int tableNumber, HashMap<EnumFoodCat, ArrayList<Food>> orders) {
        this.chef = chef;
        this.tableNumber = tableNumber;
        this.orders = orders;
    }

    public void addFoodToCategory(EnumFoodCat category, Food food) {
        orders.computeIfAbsent(category, k -> new ArrayList<>()).add(food);
    }

    @Override
    public void executeOrder() {
        chef.analyzeOrder();
        chef.collectFoodStaff(orders);
        chef.preparingFood(orders);
    }

    @Override
    public void undoOrder() {
        chef.stopAndRecallOrder();
    }
}
