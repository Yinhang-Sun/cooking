package com.laioffer.Cooking.groceryStore;

import java.util.ArrayList;
import java.util.List;

public class GroceryStoreTest {
    public static void main(String[] args) {
        //0. New a store
        GroceryStore store = new GroceryStore();

        //1. Sell 10 groceryList[1], find the total price, and update the item left in the store
        System.out.println("1. Sell 10 groceryList[1], find the total price, and update the item left in the store");
        GroceryItem sellItem = new GroceryItem("Rice (white)",1.83, 10);
        double totalPrice = store.sellGrocery(sellItem);

        System.out.println("Quantity of Rice (white): " + store.groceryList[1].getItemQuantity());
        System.out.println("Total money: " + totalPrice);

        //2. Sell 20 Eggs and 20 Lettuces, find the total money spent, and update these two items' quantities left in the store
        System.out.println("2. Sell 20 Eggs and 20 Lettuces, find the total money spent, and update these two items' quantities left in the store");
        List<GroceryItem> sellItems = new ArrayList<>();
        sellItems.add(new GroceryItem("Eggs", 3.07, 20));
        sellItems.add(new GroceryItem("Lettuce", 1.73, 20));
        double totalMoney = store.sellGrocery(sellItems);
        System.out.println("Total money: " + totalMoney);
        System.out.println("Quantity of Eggs: " + store.groceryList[8].getItemQuantity());
        System.out.println("Quantity of Lettuce: " + store.groceryList[9].getItemQuantity());

        //3. Stock 20 groceryList[1], update the item in the store
        System.out.println("3. Stock 20 groceryList[1], update the item in the store");
        GroceryItem stockItem = new GroceryItem("Rice (white)",1.83, 20);
        store.stockGrocery(stockItem);
        System.out.println("Quantity of Rice (white): " + store.groceryList[1].getItemQuantity());

        //4. Stock 50 Chicken Fillets and 50 Beef Round, update these two items' quantities in the store
        System.out.println("4. Stock 50 Chicken Fillets and 50 Beef Round, update these two items' quantities in the store");
        List<GroceryItem> stockItems = new ArrayList<>();
        stockItems.add(new GroceryItem("Chicken Fillets",4.81, 50));
        stockItems.add(new GroceryItem("Beef Round",6.17, 50));
        store.stockGrocery(stockItems);
        System.out.println("Quantity of Chicken Fillets: " + store.groceryList[2].getItemQuantity());
        System.out.println("Quantity of Beef Round: " + store.groceryList[3].getItemQuantity());
    }
}
