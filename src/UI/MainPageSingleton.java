/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

/**
 *
 * @author charles
 */
public class MainPageSingleton {
    
        
    private String  Country    = null;
    private String  MenuCategory   = null;
    private String  MenuFormat           = null;

    private static MainPageSingleton mainPageSingleton=null;
    
    public static MainPageSingleton getInstance(){
        if(mainPageSingleton==null) mainPageSingleton=new MainPageSingleton();
        return mainPageSingleton;
    }
    private MainPageSingleton(){}

    public String getCountry() {
        return Country;
    }

    public void setCountry(String Country) {
        this.Country = Country;
    }

    public String getMenuCategory() {
        return MenuCategory;
    }

    public void setMenuCategory(String MenuCategory) {
        this.MenuCategory = MenuCategory;
    }

    public String getMenuFormat() {
        return MenuFormat;
    }

    public void setMenuFormat(String MenuFormat) {
        this.MenuFormat = MenuFormat;
    }

}
