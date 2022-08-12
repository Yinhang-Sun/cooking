package com.laioffer.Cooking.groceryStore;

public class GroceryItemDemo {
    public static void main(String[] args) {
        GroceryItem item = new GroceryItem(GroceryType.MILK, 10);
        System.out.println("Name: " + item.getItemName());
        System.out.println("Price: " + item.getItemPrice());
        System.out.println("Quantity: " + item.getItemQuantity());
        item.setItemQuantity(20);
        System.out.println("Quantity updated: " + item.getItemQuantity());
    }
}
