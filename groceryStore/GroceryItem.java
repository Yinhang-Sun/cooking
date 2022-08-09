package com.laioffer.Cooking.groceryStore;


public class GroceryItem {
    // JOHNZOELLER: Change this to an enum.
    GroceryType name;
    int quantity;

    GroceryItem(GroceryType name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public GroceryType getItemName() {
        return this.name;
    }

    public double getItemPrice() {
        return this.name.showPrice();
    }

    public int getItemQuantity() {
        return this.quantity;
    }

    public void setItemQuantity(int quantity) {
        this.quantity = quantity;
    }

}
