package com.laioffer.Cooking.groceryStore;

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
    // Enum fields
    MILK(3.44),
    RICE(1.83),
    CHICKEN_FILET(4.81),
    BEEF(6.17),
    APPLE(2.14),
    BANANA(0.72),
    ORANGE(1.86),
    ONION(1.20),
    LETTUCE(1.73),
    EGG(3.07);

    // Constructor
    GroceryType(double price) {
        this.price = price;
    }

    // Internal state
    private double price;

    public double showPrice() {
        return price;
    }
};
