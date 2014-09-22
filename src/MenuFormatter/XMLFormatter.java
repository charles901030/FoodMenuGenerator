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
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author charles
 */
public class XMLFormatter implements IMenuFormatter{
   
    Menu menu=new Menu();

    public XMLFormatter(IMenuGenerator menuGenerator){
   
        menu=menuGenerator.getMenu();
    }
    
    @Override
    public String generateMenu(String Country,String Category) {
        
         String fileName=Country+"-Menu-"+Category+".xml";
        try {
               FileOutputStream out= new FileOutputStream(fileName,false);
               PrintStream print=new PrintStream(out);  
               StringBuffer outPutMenu=new StringBuffer();
               outPutMenu.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
               outPutMenu.append("<MenuItems>\n");
               outPutMenu.append(getXMLFormatMenu(menu.getBreakfastList()));
               outPutMenu.append(getXMLFormatMenu(menu.getSnackList()));
               outPutMenu.append(getXMLFormatMenu(menu.getAppetizerList()));
               outPutMenu.append(getXMLFormatMenu(menu.getLunchList()));
               outPutMenu.append(getXMLFormatMenu(menu.getDinnerList()));
               outPutMenu.append(getXMLFormatMenu(menu.getDessertList()));
               outPutMenu.append(getXMLFormatMenu(menu.getSideDishList()));
               outPutMenu.append("</MenuItems>");
               print.println(outPutMenu);
             
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(XMLFormatter.class.getName()).log(Level.SEVERE, null, ex);
        }
          return fileName;  
    }
    public String getXMLFormatMenu(ArrayList<FoodItem> FoodItems){
        StringBuffer XMLFormatMenu=new StringBuffer();
        if(FoodItems!=null&&!FoodItems.isEmpty()){       
           XMLFormatMenu.append("\t<FoodItemCategory  category=\"");
           XMLFormatMenu.append(FoodItems.get(0).getCategory());
           XMLFormatMenu.append("\">\n");
        for(FoodItem foodItem:FoodItems){
           XMLFormatMenu.append("\t\t<MenuItem>\n");
           XMLFormatMenu.append("\t\t\t<Name>");
           XMLFormatMenu.append(foodItem.getName());
           XMLFormatMenu.append("</Name>\n");
           XMLFormatMenu.append("\t\t\t<Price>\n");
           XMLFormatMenu.append("\t\t\t\t<CurrencyCode>");
           if(foodItem.getCountry().equals("GB")){
              XMLFormatMenu.append("GBP"); 
           }
           if(foodItem.getCountry().equals("US")){
              XMLFormatMenu.append("USD"); 
           }
           XMLFormatMenu.append("</CurrencyCode>\n");
           XMLFormatMenu.append("\t\t\t\t<Amount>");  
           XMLFormatMenu.append(foodItem.getPrice());
           XMLFormatMenu.append("</Amount>\n");
           XMLFormatMenu.append("\t\t\t</Price>\n");
           XMLFormatMenu.append("\t\t\t<Description>");
           XMLFormatMenu.append(foodItem.getDescription());
           XMLFormatMenu.append("</Description>\n");
           XMLFormatMenu.append("\t\t</MenuItem>\n");
        }
           XMLFormatMenu.append("\t</MenuCategory>\n");
       }
        return XMLFormatMenu.toString();
    }
    
}
