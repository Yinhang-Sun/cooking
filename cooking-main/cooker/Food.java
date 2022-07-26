package com.laioffer.Cooking.cooker;

public class Food {
    private String name;
    private Recipe recipe;

    public Food() {
        this.name = null;
        this.recipe = null;
    }

    public Food(String name, Recipe recipe) {
        this.name = name;
        this.recipe = recipe;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }


}




