package com.laioffer.Cooking.groceryStore;

public class GroceryTypeDemo {
    public static void main(String[] args) {
        System.out.println("The grocery type list: ");
        for(GroceryType groceryType : GroceryType.values()) {
            System.out.println("\t" + groceryType + " costs " + groceryType.showPrice() + " dollars.");
        }

        System.out.println("The grocery type ordinal: ");
        for(GroceryType groceryType : GroceryType.values()) {
            System.out.println("\t" + groceryType + "'s ordinal is " + groceryType.ordinal());
        }
    }
}
