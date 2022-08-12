package com.laioffer.Cooking.cooker;

public class Ingredient {
    private String ingredientName;
    private double ingredientAmount;
    private double pricePerUnit;

    public Ingredient(String ingredientName, double ingredientAmount, double ingredientPerUnit) {
        this.ingredientName = ingredientName;
        this.ingredientAmount = ingredientAmount;
        this.pricePerUnit = ingredientPerUnit;
    }

    public String getIngredientName() {
        return ingredientName;
    }

    public void setIngredientName(String ingredientName) {
        this.ingredientName = ingredientName;
    }

    public double getIngredientAmount() {
        return ingredientAmount;
    }

    public void setIngredientAmount(double ingredientAmount) {
        this.ingredientAmount = ingredientAmount;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public void setPricePerUnit(double pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }
}
