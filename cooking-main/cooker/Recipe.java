package com.laioffer.Cooking.cooker;

import java.util.List;

public class Recipe {
    private String name;
    private List<Ingredient> ingredients;
    private String directions;

    public Recipe(List<Ingredient> ingredients, String directions) {
        this.ingredients = ingredients;
        this.directions = directions;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public String getDirections() {
        return directions;
    }

    public void setDirections(String directions) {
        this.directions = directions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
