/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.util.ArrayList;

/**
 *
 * @author charles
 */
public class Menu {
    private ArrayList<FoodItem>   breakfastList    =   null;
    private ArrayList<FoodItem>   snackList        =   null;
    private ArrayList<FoodItem>   appetizerList    =   null;
    private ArrayList<FoodItem>   lunchList        =   null;
    private ArrayList<FoodItem>   dinnerList       =   null;
    private ArrayList<FoodItem>   dessertList      =   null;
    private ArrayList<FoodItem>   sideDishList     =   null;


    public ArrayList<FoodItem> getDessertList() {
        return dessertList;
    }

    public void setDessertList(ArrayList<FoodItem> dessertList) {
        this.dessertList = dessertList;
    }

    public ArrayList<FoodItem> getBreakfastList() {
        return breakfastList;
    }

    public void setBreakfastList(ArrayList<FoodItem> breakfastList) {
        this.breakfastList = breakfastList;
    }

    public ArrayList<FoodItem> getLunchList() {
        return lunchList;
    }

    public void setLunchList(ArrayList<FoodItem> lunchList) {
        this.lunchList = lunchList;
    }

    public ArrayList<FoodItem> getDinnerList() {
        return dinnerList;
    }

    public void setDinnerList(ArrayList<FoodItem> dinnerList) {
        this.dinnerList = dinnerList;
    }

    public ArrayList<FoodItem> getAppetizerList() {
        return appetizerList;
    }

    public void setAppetizerList(ArrayList<FoodItem> appetizerList) {
        this.appetizerList = appetizerList;
    }

    public ArrayList<FoodItem> getSnackList() {
        return snackList;
    }

    public void setSnackList(ArrayList<FoodItem> snackList) {
        this.snackList = snackList;
    }

    public ArrayList<FoodItem> getSideDishList() {
        return sideDishList;
    }

    public void setSideDishList(ArrayList<FoodItem> sideDishList) {
        this.sideDishList = sideDishList;
    }

    @Override
    public String toString() {
        return "Menu{" + "\tbreakfastItems = "     + breakfastList     + 
                         "\n\tsnackItems = "         + snackList       + 
                        "\n\tappetizerItems = "    + appetizerList     + 
                         "\n\tlunches = "           + lunchList        + 
                         "\n\tdinners = "           + dinnerList       + 
                          "\n\tdessertItems = "      + dessertList     + 
                         "\n\tsideDishItems = "     + sideDishList     +       
                         "\n}";
    }
}
