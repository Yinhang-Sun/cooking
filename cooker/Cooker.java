package com.laioffer.Cooking.cooker;

public class Cooker {
    private String cookerName;

    public Cooker(String cookerName) {
        this.cookerName = cookerName;
    }

    public Food cookHamburger(Recipe recipe) {
        //I want to mix the ingredients together to form mixedIngredients ready for cooking
        //Is this logic make sense? Should I simulate the process of cooking step by step?
        Ingredient[] mixedIngredients = new Ingredient[recipe.getIngredients().size()];
        for (int i = 0; i < mixedIngredients.length; i++) {
            mixedIngredients[i] = recipe.getIngredients().get(i);
        }

        //It seems that I am stuck, what should I do to the mixedIngredients to get the cookedFood if I try to simulate the
        //process of cooking step by step? Maybe my logic does not make sense?
        Food cookedFood = new Food();
        cookedFood.setName(recipe.getName());
        cookedFood.setRecipe(recipe);

        return cookedFood;
    }


}
