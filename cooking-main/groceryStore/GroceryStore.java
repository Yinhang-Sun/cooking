package com.laioffer.Cooking.groceryStore;

// General Comments
// 
//   - 1 Space between "//" and the first letter.
//   - Its always preferred to return a value instead of void.
//   - Try to avoid Strings, because they are easy to mess up.
//   - Horizontal limit should be 80 characters. or another number

import java.util.*;

// JOHNZOELLER: Why do this?
//   - Readability because the enum is expressive.
//   - Easier to extend this list and add new items
//      - int values are easier to edit than strings.
//   - Strings are immutable in Java. Google why.
//   - An integer has a fixed amont of storage, a string does not.
//     - So a string can be any length and you save space with an enum.
//   - You need to compare sold items to stocked items, its easier to compare
//     enum values
//
//   - Big One: By defining an enum for each type of grocery, we can now define
//     all the possible groceries outside of the constructor.
//     - Advantage, because the enum can be shared.
//   - You should be able to call GroceryType.length().
public enum GroceryType {
    MILK = 1;
    RICE = 2;
    CHICKEN_FILET = 3;
    BEEF = 4;
    APPLE = 5;
    // Finish this.
};

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
    private static final int NUMBER_OF_STOCKED_GROCERY_ITEM = 10;
    // Represents all the groceries in the store.  Still need this.
    // Better name would be stockedGroceries.
    public GroceryItem[] groceryList;

    // JOHNZOELLER: The constructor should just be initializing the stock of 
    // all groceries.
    // Currently it defines all the types of groceries.
    public GroceryStore() {
        groceryList = new GroceryItem[NUMBER_OF_STOCKED_GROCERY_ITEM];
        // JOHNZOELLER: Implement the GroceryType enum.
        // Need to change the constructor of GroceryItem.
        groceryList[0]= new GroceryItem(GroceryType::MILK, 3.44, 100);
        // Change the rest of these.
        groceryList[1]= new GroceryItem("Rice (white)", 1.83, 100);
        groceryList[2]= new GroceryItem("Chicken Fillets", 4.81, 100);
        groceryList[3]= new GroceryItem("Beef Round",6.17, 100);
        groceryList[4]= new GroceryItem("Apple",2.14, 100);
        groceryList[5]= new GroceryItem("Banana",0.72, 100);
        groceryList[6]= new GroceryItem("Orange",1.86, 100);
        groceryList[7]= new GroceryItem("Onion",1.20, 100);
        groceryList[8]= new GroceryItem("Lettuce", 1.73, 100);
        groceryList[9]= new GroceryItem("Eggs", 3.07, 100);

    }

    // Sell a single type item, for example, sell 100 apples, get the total price
    // JOHNZOELLER: If you define a public GetGrocery function, you can call
    // sellGrocery() from GetGrocery, and make it private.
    // Why private?
    //   - because only the GroceryStore class needs to call it.
    //   - A GroceryStoreOwner class is too much complexity right now.
    //  
    // If a cooker calls GetGrocery you need to change the store stock.
    private double sellGrocery(GroceryItem item) {
        // Calculate the total price
        double totalPrice = item.getItemPrice() * item.getItemQuantity();

        //Update the number of the current item left in the store
        for(int i = 0; i < NUMBER_OF_STOCKED_GROCERY_ITEM; i++) {
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
            if(groceryList[i].getItemName().equals(item.name)) {
                groceryList[i].setItemQuantity(groceryList[i].getItemQuantity() 
                    - item.getItemQuantity());
            }
        }

        // This is great, because it allows a reader to infer what the caller of
        // this function will do. 
        return totalPrice;
    }

    // JOHNZOELLER: Dont include examples in function comments.
    //  Function comment should just say, what does this do.
    //
    // Sell a list of types of items, for example, sell 10 apples and 10 bananas,
    //  get the total price
    public double sellGrocery(List<GroceryItem> sellItems) {
        double totalPrice = 0;
        //Call sellGrocery(GroceryItem item) API to get each item's price and update the item's quantity left in the store
        for(GroceryItem item : sellItems) {
            totalPrice += sellGrocery(item);
        }

        return totalPrice;
    }

    // stock a single type item, for example, stock 100 apples, update the 
    // quantity of the item in the store
    public void stockGrocery(GroceryItem item) {
        for(int i = 0; i < NUMBER_OF_STOCKED_GROCERY_ITEM; i++) {
            if(groceryList[i].getItemName().equals(item.name)) {
                groceryList[i].setItemQuantity(groceryList[i].getItemQuantity() 
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