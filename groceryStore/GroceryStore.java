package com.laioffer.Cooking.groceryStore;

import java.util.*;

public class GroceryStore {
    private static final int NUMBER_OF_STOCKED_GROCERY_ITEM = 10;
    public GroceryItem[] groceryList;

    public GroceryStore() {
        groceryList = new GroceryItem[NUMBER_OF_STOCKED_GROCERY_ITEM];
        groceryList[0]= new GroceryItem("Milk (regular)",3.44, 100);
        groceryList[1]= new GroceryItem("Rice (white)",1.83, 100);
        groceryList[2]= new GroceryItem("Chicken Fillets",4.81, 100);
        groceryList[3]= new GroceryItem("Beef Round",6.17, 100);
        groceryList[4]= new GroceryItem("Apple",2.14, 100);
        groceryList[5]= new GroceryItem("Banana",0.72, 100);
        groceryList[6]= new GroceryItem("Orange",1.86, 100);
        groceryList[7]= new GroceryItem("Onion",1.20, 100);
        groceryList[8]= new GroceryItem("Lettuce", 1.73, 100);
        groceryList[9]= new GroceryItem("Eggs", 3.07, 100);

    }

    //Sell a single type item, for example, sell 100 apples, get the total price
    public double sellGrocery(GroceryItem item) {
        //Calculate the total price
        double totalPrice = item.getItemPrice() * item.getItemQuantity();

        //Update the number of the current item left in the store
        for(int i = 0; i < NUMBER_OF_STOCKED_GROCERY_ITEM; i++) {
            if(groceryList[i].getItemName().equals(item.name)) {
                groceryList[i].setItemQuantity(groceryList[i].getItemQuantity() - item.getItemQuantity());
            }
        }

        return totalPrice;
    }

    //Sell a list of types of items, for example, sell 10 apples and 10 bananas, get the total price
    public double sellGrocery(List<GroceryItem> sellItems) {
        double totalPrice = 0;
        //Call sellGrocery(GroceryItem item) API to get each item's price and update the item's quantity left in the store
        for(GroceryItem item : sellItems) {
            totalPrice += sellGrocery(item);
        }

        return totalPrice;
    }

    //stock a single type item, for example, stock 100 apples, update the quantity of the item in the store
    public void stockGrocery(GroceryItem item) {
        for(int i = 0; i < NUMBER_OF_STOCKED_GROCERY_ITEM; i++) {
            if(groceryList[i].getItemName().equals(item.name)) {
                groceryList[i].setItemQuantity(groceryList[i].getItemQuantity() + item.getItemQuantity());
            }
        }
    }

    //stock a list of items, for example, stock 10 apples, and 10 bananas
    //call stockGrocery(GroceryItem item) API to update the quantity of the item in the store
    public void stockGrocery(List<GroceryItem> stockItems) {
        for (GroceryItem item : stockItems) {
            stockGrocery(item);
        }
    }





}