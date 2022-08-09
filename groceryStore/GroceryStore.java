package com.laioffer.Cooking.groceryStore;

// General Comments
//
//   - 1 Space between "//" and the first letter.
//   - Its always preferred to return a value instead of void.
//   - Try to avoid Strings, because they are easy to mess up.
//   - Horizontal limit should be 80 characters. or another number

import java.util.*;
// If you, a shopper, needed to make a grocery list, it would look like this:
// [
//   ShoppedItem(GroceryType::MILK, 1),
//   ShoppedItem(GroceryType::RICE, 10)
// ]

// A GroceryList with strings:
// [
//   ("Rice (brown)", 1)
// ]

public class GroceryStore {
    // We can delete this global variable.
    private static final int NUMBER_OF_STOCKED_GROCERY_TYPE = 10;
    // Represents all the groceries in the store.  Still need this.
    // Better name would be stockedGroceries.
    public GroceryItem[] stockedGroceries;

    // JOHNZOELLER: The constructor should just be initializing the stock of all groceries.
    // Currently it defines all the types of groceries.
    public GroceryStore() {
        stockedGroceries = new GroceryItem[NUMBER_OF_STOCKED_GROCERY_TYPE];
        // JOHNZOELLER: Implement the GroceryType enum.
        // Need to change the constructor of GroceryItem.
        stockedGroceries[0]= new GroceryItem(GroceryType.MILK,100);
        stockedGroceries[1]= new GroceryItem(GroceryType.RICE,100);
        stockedGroceries[2]= new GroceryItem(GroceryType.CHICKEN_FILET,100);
        stockedGroceries[3]= new GroceryItem(GroceryType.BEEF,100);
        stockedGroceries[4]= new GroceryItem(GroceryType.APPLE,100);
        stockedGroceries[5]= new GroceryItem(GroceryType.BANANA,100);
        stockedGroceries[6]= new GroceryItem(GroceryType.ORANGE,100);
        stockedGroceries[7]= new GroceryItem(GroceryType.ONION,100);
        stockedGroceries[8]= new GroceryItem(GroceryType.LETTUCE,100);
        stockedGroceries[9]= new GroceryItem(GroceryType.EGG,100);

    }

    // Sell a single type item, for example, sell 100 apples, get the total price
    // JOHNZOELLER: If you define a public getGrocery() function, you can call
    // sellGrocery() from getGrocery(), and make it private.
    // Why private?
    //   - because only the GroceryStore class needs to call it.
    //   - A GroceryStoreOwner class is too much complexity right now.
    // If a cooker calls getGrocery() you need to change the store stock.
    public double sellGrocery(GroceryItem item) {
        // Calculate the total price
        double totalPrice = item.getItemPrice() * item.getItemQuantity();

        // Update the sold item's quantity in the store
        updateQuantityAfterSold(item);

        return totalPrice;
    }

    // JOHNZOELLER: Instead of a for loop that iterates the grocery
    // list (looking for the target item name), write a function that
    // returns a GroceryItem that you can edit.
    // Goal is to get rid of the for loop and add logic like:
    //
    // GroceryItem item = getGroceryItem(args);
    // // decrements the item quantity.
    // sellItem(item);
    //
    // Lesson: its good to put code in small functions that describe
    // what is being done.
    // This is comparing strings.
    private void updateQuantityAfterSold(GroceryItem item) {
        //Update the number of the current sold item left in the store
        for(int i = 0; i < NUMBER_OF_STOCKED_GROCERY_TYPE; i++) {
            if(stockedGroceries[i].getItemName().equals(item.name)) {
                stockedGroceries[i].setItemQuantity(stockedGroceries[i].getItemQuantity()
                        - item.getItemQuantity());
            }
        }
    }

    // JOHNZOELLER: Don't include examples in function comments.
    //  Function comment should just say, what does this do.
    //
    // Sell a list of types of items, for example, sell 10 apples and 10 bananas,
    //  get the total price
    public double sellGrocery(List<GroceryItem> sellItems) {
        double totalPrice = 0;
        //Call sellGrocery(GroceryItem item) API to get each item's price and
        // update the item's quantity left in the store
        for(GroceryItem item : sellItems) {
            totalPrice += sellGrocery(item);
        }

        return totalPrice;
    }

    // stock a single type item, for example, stock 100 apples, update the
    // quantity of the item in the store
    public void stockGrocery(GroceryItem item) {
        updateQuantityAfterStocked(item);
    }

    private void updateQuantityAfterStocked(GroceryItem item) {
        //Update the number of the current sold item left in the store
        for(int i = 0; i < NUMBER_OF_STOCKED_GROCERY_TYPE; i++) {
            if(stockedGroceries[i].getItemName().equals(item.name)) {
                stockedGroceries[i].setItemQuantity(stockedGroceries[i].getItemQuantity()
                        + item.getItemQuantity());
            }
        }
    }

    //stock a list of items, for example, stock 10 apples, and 10 bananas
    //call stockGrocery(GroceryItem item) API to update the quantity of the item
    // in the store
    public void stockGrocery(List<GroceryItem> stockItems) {
        for (GroceryItem item : stockItems) {
            stockGrocery(item);
        }
    }





}