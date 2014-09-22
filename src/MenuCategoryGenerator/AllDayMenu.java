/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MenuCategoryGenerator;

import Entities.*;
import MenuReader.*;
import java.util.ArrayList;
/**
 *
 * @author charles
 */
public class AllDayMenu implements IMenuGenerator{
    
    ArrayList<FoodItem> breakfastFoodList       =   new ArrayList();
    ArrayList<FoodItem> lunchFoodList           =   new ArrayList();
    ArrayList<FoodItem> dinnerFoodList          =   new ArrayList();
    ArrayList<FoodItem> snackFoodList           =   new ArrayList();
    ArrayList<FoodItem> appetizerFoodList       =   new ArrayList();
    ArrayList<FoodItem> sidedishFoodList        =   new ArrayList();
    ArrayList<FoodItem> dessertFoodList         =   new ArrayList();
    ArrayList<FoodItem> FoodItems=new  ArrayList<FoodItem>();
    Menu allDayMenu=new Menu();
    
    public AllDayMenu(IReader Reader){
       FoodItems=Reader.getReader();
    }
   
    
    @Override
    public Menu getMenu() {
       for(FoodItem foodItem:FoodItems){
           if(foodItem.getCategory().equals("Breakfast"))
               breakfastFoodList.add(foodItem);
           if(foodItem.getCategory().equals("Snack"))
               snackFoodList.add(foodItem);
           if(foodItem.getCategory().equals("Appetizer"))
               appetizerFoodList.add(foodItem);
           if(foodItem.getCategory().equals("Lunch"))
               lunchFoodList.add(foodItem);
           if(foodItem.getCategory().equals("Dinner"))
               dinnerFoodList.add(foodItem);
           if(foodItem.getCategory().equals("Dessert"))
               dessertFoodList.add(foodItem);
           if(foodItem.getCategory().equals("Side Dish"))
               sidedishFoodList.add(foodItem); 
       }
           allDayMenu.setBreakfastList(breakfastFoodList);
           allDayMenu.setAppetizerList(appetizerFoodList);
           allDayMenu.setDessertList(dessertFoodList);
           allDayMenu.setDinnerList(dinnerFoodList);
           allDayMenu.setLunchList(lunchFoodList);
           allDayMenu.setSnackList(snackFoodList);
           allDayMenu.setSideDishList(sidedishFoodList);
           return allDayMenu;
    }
    
}
