/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MenuCategoryGenerator;
import MenuReader.*;
/**
 *
 * @author charles
 */
public class MenuGeneratorFactory {

     public static IMenuGenerator generateCategoryMenu(String Category,IReader Reader){
         if(Category.equals("AllDay"))
             return new AllDayMenu(Reader);
         if(Category.equals("Diner"))
             return new DinerMenu(Reader);
         if(Category.equals("Evening"))
             return new EveningMenu(Reader);
         else 
             return null;
     }
}
