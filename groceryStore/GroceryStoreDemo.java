package com.laioffer.Cooking.groceryStore;

import java.util.ArrayList;
import java.util.List;

public class GroceryStoreDemo {
    public static void main(String[] args) {
        //0. Generate a new store
        GroceryStore store = new GroceryStore();

        //1. Sell 10 MILK, find the total price, and update the item in the store
        System.out.println("1. Sell 10 MILK: ");
        GroceryItem sellItem = new GroceryItem(GroceryType.MILK, 10);
        double totalPrice = store.sellGrocery(sellItem);
        System.out.println("\tQuantity of MILK in the store: " + store.stockedGroceries[0].getItemQuantity());
        System.out.println("\tTotal price: " + totalPrice);

        //2. Sell 20 EGG and 20 LETTUCE, find the total price, and update their quantities in the store
        System.out.println("2. Sell 20 EGG and 20 LETTUCE: ");
        List<GroceryItem> sellItems = new ArrayList<>();
        sellItems.add(new GroceryItem(GroceryType.EGG, 20));
        sellItems.add(new GroceryItem(GroceryType.LETTUCE, 20));
        double totalPrices = store.sellGrocery(sellItems);
        System.out.println("\tTotal price: " + totalPrices);
        System.out.println("\tQuantity of LETTUCE in the store: " + store.stockedGroceries[8].getItemQuantity());
        System.out.println("\tQuantity of EGG in the store: " + store.stockedGroceries[9].getItemQuantity());

        //3. Stock 20 RiCE, update the item in the store
        System.out.println("3. Stock 20 RiCE: ");
        GroceryItem stockItem = new GroceryItem(GroceryType.RICE, 20);
        store.stockGrocery(stockItem);
        System.out.println("\tQuantity of RiCE in the store: " + store.stockedGroceries[1].getItemQuantity());

        //4. Stock 50 CHICKEN_FILET and 50 BEEF, update their quantities in the store
        System.out.println("4. Stock 50 CHICKEN_FILET and 50 BEEF: ");
        List<GroceryItem> stockItems = new ArrayList<>();
        stockItems.add(new GroceryItem(GroceryType.CHICKEN_FILET, 50));
        stockItems.add(new GroceryItem(GroceryType.BEEF, 50));
        store.stockGrocery(stockItems);
        System.out.println("\tQuantity of CHICKEN_FILET in the store: " + store.stockedGroceries[2].getItemQuantity());
        System.out.println("\tQuantity of BEEF in the store: " + store.stockedGroceries[3].getItemQuantity());
    }
}
