package com.laioffer.Cooking.cooker;

import com.laioffer.Cooking.groceryStore.GroceryItem;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Cooker {
    // A cooker should have a name, and some default stockedIngredients and a recipeBook
    private String cookerName;
    // using a set to store the stockedIngredients to facilitate checking
    private Set<Ingredient> stockedIngredients;
    private RecipeBook recipeBook;

    public Cooker(String cookerName, Set<Ingredient> stockedIngredients, RecipeBook recipeBook) {
        this.cookerName = cookerName;
        this.stockedIngredients = stockedIngredients;
        this.recipeBook = recipeBook;
    }

    // 1. The cookRecipe function will cook a meal according to the given recipe
    // if all ingredients for the recipe are available
    // otherwise, return null
    public Meal cookRecipe(Recipe recipe) {
        Meal meal = new Meal();
        if (verifyStockedIngredients(recipe, stockedIngredients)) {
            // If a recipe is verified, we will cook the meal step by step
            for (CookingStep step : recipe.getSteps()) {
                cookMealAccordingToStep(step, meal);
            }
        }
        return meal;
    }

    // 1a. The verifyStockedIngredients function will check if all the ingredients of a recipe are available
    // in the cooker's stockedIngredients set
    private boolean verifyStockedIngredients(Recipe recipe, Set<Ingredient> stockedIngredients) {
        for (Ingredient ingredient : recipe.getIngredients()) {
            // If any ingredient for a recipe is not in the stockedIngredients, return false
            if (!stockedIngredients.contains(ingredient)) {
                return false;
            }
        }
        return true;
    }

    // 1b. This function will cook a meal according to a step
    private Meal cookMealAccordingToStep(CookingStep step, Meal meal) {
        // Do something in the step ?
        return meal;
    }

    // 2. The cookIngredients function will cook a meal using the given ingredients if a recipe for the ingredients exist
    public Meal cookIngredients(Set<Ingredient> givenIngredients) {
        Recipe recipe = findRecipe(givenIngredients, recipeBook);
        // If we find a recipe for the givenIngredients
        // We will call the function cookRecipe() above to cook a meal
        if (recipe != null) {
            return cookRecipe(recipe);
        }
        return null;
    }

    // 2a. This function will find a recipe for a set of givenIngredients in the recipeBook
    // To facilitate checking ingredient, we use a set to store the givenIngredients
    private Recipe findRecipe(Set<Ingredient> givenIngredients, RecipeBook recipeBook) {
        // Get recipe in the recipeBook one by one and compare each recipe to the givenIngredients
        for (Recipe recipe : recipeBook.getRecipes().values()) {
            if (isMatch(givenIngredients, recipe)) {
                return recipe;
            }
        }
        return null;
    }

    // 2b. This function is used to determine if a set of givenIngredients and a specific recipe can match each other
    private boolean isMatch(Set<Ingredient> givenIngredients, Recipe recipe) {
        // We should try to find each required ingredient in a recipe int the givenIngredients set
        for (Ingredient ingredient : recipe.getIngredients()) {
            if (!givenIngredients.contains(ingredient)) {
                return false;
            }
        }
        return true;
    }

    public String getCookerName() {
        return cookerName;
    }

    public void setCookerName(String cookerName) {
        this.cookerName = cookerName;
    }

    public Set<Ingredient> getStockedIngredients() {
        return stockedIngredients;
    }

    public void setStockedIngredients(Set<Ingredient> stockedIngredients) {
        this.stockedIngredients = stockedIngredients;
    }

    public RecipeBook getRecipeBook() {
        return recipeBook;
    }

    public void setRecipeBook(RecipeBook recipeBook) {
        this.recipeBook = recipeBook;
    }
}


    /* The following is comment from JOHNZOELLER.

    // JOHNZOELLER: Eliminate this and replace with the general purpose
    // functions from below.

    public Meal cookMeal(Recipe recipe) {
//        I want to mix the ingredients together to form mixedIngredients ready for cooking
//        Is this logic make sense? Should I simulate the process of cooking step by step?
//
//         JOHNZOELLER: Yes I like that idea. But keep it simple,
//         because you don't want to end up with a list of 100 mixedIngredients.
//         This can be as complicated or as simple as you want.
//         Start simple, then do things like inheritance polymorphism, etc.
        Ingredient[] mixedIngredients = new Ingredient[recipe.getIngredients().size()];
        for (int i = 0; i < mixedIngredients.length; i++) {
            mixedIngredients[i] = recipe.getIngredients().get(i);
        }
    }

    //It seems that I am stuck, what should I do to the mixedIngredients to
    // get the cookedFood if I try to simulate the
    //process of cooking step by step? Maybe my logic does not make sense?
    // JOHNZOELLER: You need a function.
    //   MixedIngredient mixed = CombineIngredients(List<Ingredients> list);
    //   Meal meal = CombineMixedIngredients(List<MixedIngredients> list);
//        Food cookedFood = new Food();
//        cookedFood.setName(recipe.getName());
//        cookedFood.setRecipe(recipe);
//
//        return cookedFood;

    // List<Ingredients> VisitGroceryStore(
    //      GroceryList list, GroceryStore store, double money) {
    //  this looks weird, and its not very useful.
    //  double money_spent = store.sellGrocery()
    //
    //  what we really need is
    //  Ingredient ingredient = store.GetGrocery(list[0]);
    //  result.push_back(ingredient);
    // }


// JOHNZOELLER: The easy way to figure out what your functionality should be, is
// to write a sentence describing what you want to do.

// A sentence that describes how to cook any recipe:
//   Mix the INGREDIENTS up, one step at a time. Check the RECIPE to make sure
//   you have the proper INGREDIENTS.
//
// Two new functions
//   1. CookRecipe: Takes a recipe and cooks it if possible
//         "I would like to bake a chocolate cake"
//         I know what I want to make
//   2. CookIngredients: Cooks something if the ingredients are all in a recipe.
//         "I have purchased bananas and milk, what can I make?"
//          I do not know what to make.

// CookRecipe(Recipe recipe)
//   // write this code
//   // `stocked_ingredients` is what you own.
//   // VerifyStockedIngredients(recipe, stocked_ingredients);
//   // List<CookingStep> steps = GetSteps(recipe);
// for each step, do it.

    //
//
// Imagine a cookbook or a recipe book.
// bool CookIngredients(List<Ingredients> ingredients);
// // if(HasRecipe(ingredients, cookbook))
// //   GetRecipe(...





     */