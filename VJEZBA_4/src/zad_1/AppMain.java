package zad_1;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Zadatak:
 * Implementirati aplikaciju koja simulira naručivanje hrane u restoranu koristeći Command Pattern.
 *
 * Ključne funkcionalnosti:
 * 1. Konobar (Invoker) upravlja narudžbama i prosljeđuje ih kuharu (Receiver).
 * 2. Kuhar analizira, priprema i, po potrebi, poništava narudžbe.
 * 3. Narudžbe su organizirane po kategorijama hrane.
 * 4. Generira se konzolni ispis svih koraka obrade narudžbe.
 *
 * Cilj:
 * Demonstrirati primjenu Command Patterna i omogućiti testiranje funkcionalnosti.
 *
 * Glavna klasa testira osnovne funkcionalnosti:
 * 1. Kreiranje narudžbe s različitim kategorijama hrane.
 * 2. Prosljeđivanje narudžbe konobaru za izvršenje.
 * 3. Povlačenje narudžbe od strane konobara.
 */
    public class AppMain {
        public static void main(String[] args) {
            Chef chef = new Chef("Marko");
            WaiterInvoker waiter = new WaiterInvoker("Ivan");

            HashMap<EnumFoodCat, ArrayList<Food>> orders = new HashMap<>();
            OrderCmd orderCmd = new OrderCmd(chef, 10, orders);

            // Dodavanje hrane
            orderCmd.addFoodToCategory(EnumFoodCat.Fish, new Food("Salmon", 55.43));
            orderCmd.addFoodToCategory(EnumFoodCat.Fish, new Food("Tuna", 42.50));
            orderCmd.addFoodToCategory(EnumFoodCat.Dessert, new Food("Ice Cream", 12.99));

            // Postavljanje i izvršavanje narudžbe
            waiter.setOrderCommand(orderCmd);
            waiter.setUpOrder();

            // Povlačenje narudžbe
            waiter.withdrawOrder();
        }
    }
