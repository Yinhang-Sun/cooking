package com.laioffer.Cooking.cooker;

import java.util.List;

public class Recipe {
    private String name;
    private List<Ingredient> ingredients;
    private List<CookingStep> steps;

    public Recipe(String name, List<Ingredient> ingredients, List<CookingStep> steps) {
        this.name = name;
        this.ingredients = ingredients;
        this.steps = steps;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public List<CookingStep> getSteps() {
        return steps;
    }

    public void setSteps(List<CookingStep> steps) {
        this.steps = steps;
    }
}
