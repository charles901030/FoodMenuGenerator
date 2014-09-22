/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

/**
 *
 * @author charles
 */
public enum FoodCategory {
    BREAKFAST("Breakfast"),
    SNACK("Snack"),
    APPETIZER("Appetizer"),
    LUNCH("Lunch"),
    DINNER("Dinner"),
    DESSERT("Dessert"),
    SIDE_DISH("Side Dish");
    
    private String foodCategory;
    
    FoodCategory(String foodCategory){
        this.foodCategory = foodCategory;
    }
    public static FoodCategory ConvertToFoodCategory(String type){
     if (type != null) {
      for (FoodCategory foodCategory : FoodCategory.values()) {
        if (type.equalsIgnoreCase(foodCategory.foodCategory)) {
          return foodCategory;
        }
      }
    }
    return null;
    }
    
}
