package zad_1;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Klasa Chef predstavlja kuhara koji analizira, priprema i poništava narudžbe.
 */
public class Chef {
    private String name;

    public Chef(String name) {
        this.name = name;
    }

    public void analyzeOrder() {
        System.out.println("Chef " + name + " is analyzing the order.");
    }

    public void collectFoodStaff(HashMap<EnumFoodCat, ArrayList<Food>> orders) {
        System.out.println(name + " -> collecting foodstuffs for:");
        for (EnumFoodCat category : orders.keySet()) {
            System.out.println("Category: " + category);
            for (Food food : orders.get(category)) {
                System.out.println(food + " in this order...");
            }
        }
        System.out.println();
    }

    public void preparingFood(HashMap<EnumFoodCat, ArrayList<Food>> orders) {
        System.out.println(name + " -> preparing food:");
        for (EnumFoodCat category : orders.keySet()) {
            System.out.println("Category: " + category);
            for (Food food : orders.get(category)) {
                System.out.println(food);
            }
        }
        System.out.println("All is finished and can be served to guests.");
    }

    public void stopAndRecallOrder() {
        System.out.println("Chef " + name + " is stopping and recalling the order.");
    }
}