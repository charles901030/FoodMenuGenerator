/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MenuReader;
import Entities.*;
/**
 *
 * @author charles
 */
public class MenuReaderFactory {
    IReader Reader=null;
    public static IReader generateReader(String Country){
        if(Country.equals("GB")) 
            return new XMLReader();
        if(Country.equals("US"))
            return new JSONReader();
        else 
            return null;
    }
    
}
