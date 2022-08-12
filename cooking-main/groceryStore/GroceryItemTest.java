package com.laioffer.Cooking.groceryStore;

// This is good. Write a test class for every file.
public class GroceryItemTest {
    public static void main(String[] args) {
        GroceryItem item = new GroceryItem("Beef", 8.99, 10);
        System.out.println("Name: " + item.getItemName());
        System.out.println("Price: " + item.getItemPrice());
        System.out.println("Quantity: " + item.getItemQuantity());
        item.setItemName("Fresh Beef");
        System.out.println("Name updated: " + item.getItemName());
        item.setItemPrice(10.99);
        System.out.println("Price updated: " + item.getItemPrice());
        item.setItemQuantity(20);
        System.out.println("Quantity updated: " + item.getItemQuantity());
    }
}
