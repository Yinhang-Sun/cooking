package com.laioffer.Cooking.cooker;

import java.util.List;
import java.util.Map;

public class RecipeBook {
    private String name;
    private Map<String, Recipe> recipes;

    public RecipeBook(List<Recipe> recipes) {
        for(Recipe recipe : recipes) {
            this.recipes.put(recipe.getName(), recipe);
        }
    }

    public Recipe getRecipe(String recipeName) {
        return this.recipes.getOrDefault(recipeName, null);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, Recipe> getRecipes() {
        return recipes;
    }

    public void setRecipes(Map<String, Recipe> recipes) {
        this.recipes = recipes;
    }
}
