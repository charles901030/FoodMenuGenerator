/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MenuFormatter;

import Entities.FoodItem;
import Entities.Menu;
import MenuCategoryGenerator.IMenuGenerator;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author charles
 */
public class TXTFormatter implements IMenuFormatter{

     Menu menu=new Menu();
     //File file=new File();
    
    public TXTFormatter(IMenuGenerator menuGenerator){
   
        menu=menuGenerator.getMenu();
    }
    
    @Override
    public String generateMenu(String Country,String Category) {
      
              String fileName=Country+"-Menu-"+Category+".txt";
        try {
            //when create new fil,not append the previous one
               FileOutputStream out= new FileOutputStream(fileName,false);
               PrintStream print=new PrintStream(out);  
               StringBuffer outPutMenu=new StringBuffer();
               outPutMenu.append("Menu\n\n");
               outPutMenu.append(getTXTFormatMenu(menu.getBreakfastList()));
               outPutMenu.append(getTXTFormatMenu(menu.getSnackList()));
               outPutMenu.append(getTXTFormatMenu(menu.getAppetizerList()));
               outPutMenu.append(getTXTFormatMenu(menu.getLunchList()));
               outPutMenu.append(getTXTFormatMenu(menu.getDinnerList()));
               outPutMenu.append(getTXTFormatMenu(menu.getDessertList()));
               outPutMenu.append(getTXTFormatMenu(menu.getSideDishList()));
               print.println(outPutMenu);
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(XMLFormatter.class.getName()).log(Level.SEVERE, null, ex);
        }
            return fileName;
    }
    public String getTXTFormatMenu(ArrayList<FoodItem> FoodItems){
        StringBuffer TXTFormatMenu=new StringBuffer();
        if(FoodItems!=null&&!FoodItems.isEmpty()){   
           TXTFormatMenu.append("\n");
           TXTFormatMenu.append(FoodItems.get(0).getCategory().toUpperCase());
           TXTFormatMenu.append("\n\n");
        for(FoodItem foodItem:FoodItems){
           TXTFormatMenu.append(foodItem.getName());
           TXTFormatMenu.append("\t\t\t");
           if(foodItem.getCountry().equals("GB")){
              TXTFormatMenu.append("GBP"); 
           }
           if(foodItem.getCountry().equals("US")){
              TXTFormatMenu.append("USD"); 
           }
           TXTFormatMenu.append(foodItem.getPrice());
           TXTFormatMenu.append("\n");
           TXTFormatMenu.append(foodItem.getDescription());
           TXTFormatMenu.append("\n\n");
        }
      
       }
        return TXTFormatMenu.toString();
    }
    
    
}
