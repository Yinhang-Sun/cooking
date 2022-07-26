package com.laioffer.Cooking.groceryStore;


public class GroceryItem {
    // JOHNZOELLER: Change this to an enum.
    String name;
    double price;
    int quantity;

    GroceryItem(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() {
        return this.name;
    }

    public double getItemPrice() {
        return this.price;
    }

    public int getItemQuantity() {
        return this.quantity;
    }

    public void setItemName(String name) {
        this.name = name;
    }

    public void setItemPrice(double price) {this.price = price;}

    public void setItemQuantity(int quantity) {
        this.quantity = quantity;
    }

}
