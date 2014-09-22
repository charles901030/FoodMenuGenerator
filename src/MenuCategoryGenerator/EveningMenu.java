/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MenuCategoryGenerator;

import Entities.FoodItem;
import Entities.Menu;
import MenuReader.IReader;
import java.util.ArrayList;

/**
 *
 * @author charles
 */
public class EveningMenu implements IMenuGenerator{

 
    ArrayList<FoodItem> breakfastFoodList       =   new ArrayList();
    ArrayList<FoodItem> lunchFoodList           =   new ArrayList();
    ArrayList<FoodItem> dinnerFoodList          =   new ArrayList();
    ArrayList<FoodItem> snackFoodList           =   new ArrayList();
    ArrayList<FoodItem> appetizerFoodList       =   new ArrayList();
    ArrayList<FoodItem> sidedishFoodList        =   new ArrayList();
    ArrayList<FoodItem> dessertFoodList         =   new ArrayList();
    Menu eveningMenu=new Menu();
    ArrayList<FoodItem> FoodItems=new  ArrayList<FoodItem>();
    
    
    public EveningMenu(IReader Reader){
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
           eveningMenu.setBreakfastList(null);
           eveningMenu.setAppetizerList(appetizerFoodList);
           eveningMenu.setDessertList(dessertFoodList);
           eveningMenu.setDinnerList(dinnerFoodList);
           eveningMenu.setLunchList(null);
           eveningMenu.setSnackList(null);
           eveningMenu.setSideDishList(sidedishFoodList);
        return eveningMenu;
    }
    
}
