/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MenuFormatter;

import MenuCategoryGenerator.IMenuGenerator;

/**
 *
 * @author charles
 */
public class MenuFormatterFactory {
    
    public static IMenuFormatter generateFormatter(String Format,IMenuGenerator MenuGenerator){
        if(Format.equals("TXT"))
            return new TXTFormatter(MenuGenerator);
        if(Format.equals("HTML"))
            return new HTMLFormatter(MenuGenerator);
        if(Format.equals("XML"))
            return new XMLFormatter(MenuGenerator);
        else 
            return null;
    }
}
