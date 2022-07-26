package com.laioffer.Cooking.cooker;

public class Cooker {
    private String cookerName;

    public Cooker(String cookerName) {
        this.cookerName = cookerName;
    }

    // JOHNZOELLER: Eliminate this and replace with the general purpose
    // functions from below.
    public Meal cookHamburger(Recipe recipe) {
        //I want to mix the ingredients together to form mixedIngredients ready for cooking
        //Is this logic make sense? Should I simulate the process of cooking step by step?
        //
        // JOHNZOELLER: Yes I like that idea. But keep it simple, because you
        // dont want to end up with a list of 100 mixedIngredients.
        // This can be as complicated or as simple as you want.
        // Start simple, then do things like inheritance polymorphism, etc.
        Ingredient[] mixedIngredients = new Ingredient[recipe.getIngredients().size()];
        for (int i = 0; i < mixedIngredients.length; i++) {
            mixedIngredients[i] = recipe.getIngredients().get(i);
        }

        //It seems that I am stuck, what should I do to the mixedIngredients to
        // get the cookedFood if I try to simulate the
        //process of cooking step by step? Maybe my logic does not make sense?
        // JOHNZOELLER: You need a function.
        //   MixedIngredient mixed = CombineIngredients(List<Ingredients> list);
        //   Meal meal = CombineMixedIngredients(List<MixedIngredients> list);
        Food cookedFood = new Food();
        cookedFood.setName(recipe.getName());
        cookedFood.setRecipe(recipe);

        return cookedFood;
    }


    // List<Ingredients> VisitGroceryStore(
    //      GroceryList list, GroceryStore store, double money) {
    //  this looks weird, and its not very useful.
    //  double money_spent = store.sellGrocery()
    //
    //  what we really need is
    //  Ingredient ingredient = store.GetGrocery(list[0]);
    //  result.push_back(ingredient);
    // }

}

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
// 
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
