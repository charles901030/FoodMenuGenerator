/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MenuFormatter;

import Entities.FoodItem;
import Entities.Menu;
import MenuCategoryGenerator.IMenuGenerator;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author charles
 */
public class HTMLFormatter implements IMenuFormatter{
    
    Menu menu=new Menu();
    
    public HTMLFormatter(IMenuGenerator menuGenerator){
        menu=menuGenerator.getMenu();
    }
    
    @Override
    public String generateMenu(String Country,String Category) {
               String fileName=Country+"-Menu-"+Category+".html";
      try {
               FileOutputStream out= new FileOutputStream(fileName,false);
               PrintStream print=new PrintStream(out);  
               StringBuffer outPutMenu=new StringBuffer();
               outPutMenu.append(getHTMLFormatMenu(menu.getBreakfastList()));
               outPutMenu.append(getHTMLFormatMenu(menu.getSnackList()));
               outPutMenu.append(getHTMLFormatMenu(menu.getAppetizerList()));
               outPutMenu.append(getHTMLFormatMenu(menu.getLunchList()));
               outPutMenu.append(getHTMLFormatMenu(menu.getDinnerList()));
               outPutMenu.append(getHTMLFormatMenu(menu.getDessertList()));
               outPutMenu.append(getHTMLFormatMenu(menu.getSideDishList()));
               print.println(outPutMenu);
           
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(XMLFormatter.class.getName()).log(Level.SEVERE, null, ex);
        }
        return fileName;
   }
      public String getHTMLFormatMenu(ArrayList<FoodItem> FoodItems){
        StringBuffer HTMLFormatMenu=new StringBuffer();
        if(FoodItems!=null&&!FoodItems.isEmpty()){   
           HTMLFormatMenu.append("<H1>");
           HTMLFormatMenu.append(FoodItems.get(0).getCategory().toUpperCase());
           HTMLFormatMenu.append("</H1>");
        for(FoodItem foodItem:FoodItems){
           HTMLFormatMenu.append("<LI>");
           HTMLFormatMenu.append(foodItem.getName());
           HTMLFormatMenu.append("<BR>");
           HTMLFormatMenu.append("<I>");
           HTMLFormatMenu.append(foodItem.getDescription());
           HTMLFormatMenu.append("</I>");
           HTMLFormatMenu.append("<BR>");
           if(foodItem.getCountry().equals("GB")){
              HTMLFormatMenu.append("GBP"); 
           }
           if(foodItem.getCountry().equals("US")){
              HTMLFormatMenu.append("USD"); 
           }
           HTMLFormatMenu.append(foodItem.getPrice());
           HTMLFormatMenu.append("</LI>");
        }
      
       }
        return HTMLFormatMenu.toString();
    }
}