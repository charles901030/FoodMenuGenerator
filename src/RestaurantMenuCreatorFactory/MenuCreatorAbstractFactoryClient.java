/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package RestaurantMenuCreatorFactory;

/**
 *
 * @author charles
 */
public class MenuCreatorAbstractFactoryClient {
    
    private static  MenuCreatorAbstractFactory menuCreatorAbstractFactory =null;
    public static MenuCreatorAbstractFactory getAbstractFactory(String Country,String Category,String Format){
        if(Country.equals("GB")&&Category.equals("AllDay")&&Format.equals("HTML")){
            menuCreatorAbstractFactory=new GBAllDayHTMLMenuCreator();
        }
        if(Country.equals("GB")&&Category.equals("AllDay")&&Format.equals("TXT")){
            menuCreatorAbstractFactory=new GBAllDayTXTMenuCreator();
        }
        if(Country.equals("GB")&&Category.equals("AllDay")&&Format.equals("XML")){
            menuCreatorAbstractFactory=new GBAllDayXMLMenuCreator();
        }
        if(Country.equals("GB")&&Category.equals("Diner")&&Format.equals("HTML")){
            menuCreatorAbstractFactory=new GBDinerHTMLMenuCreator();
        }
        if(Country.equals("GB")&&Category.equals("Diner")&&Format.equals("TXT")){
            menuCreatorAbstractFactory=new GBDinerTXTMenuCreator();
        }
        if(Country.equals("GB")&&Category.equals("Diner")&&Format.equals("XML")){
            menuCreatorAbstractFactory=new GBDinerXMLMenuCreator();
        }
        if(Country.equals("GB")&&Category.equals("Evening")&&Format.equals("HTML")){
            menuCreatorAbstractFactory=new GBEveningHTMLMenuCreator();
        }
        if(Country.equals("GB")&&Category.equals("Evening")&&Format.equals("XML")){
            menuCreatorAbstractFactory=new GBEveningXMLMenuCreator();
        }
        if(Country.equals("GB")&&Category.equals("Evening")&&Format.equals("TXT")){
            menuCreatorAbstractFactory=new GBEveningTXTMenuCreator();
        }
        if(Country.equals("US")&&Category.equals("AllDay")&&Format.equals("HTML")){
            menuCreatorAbstractFactory=new USAllDayHTMLMenuCreator();
        }
        if(Country.equals("US")&&Category.equals("AllDay")&&Format.equals("TXT")){
            menuCreatorAbstractFactory=new USAllDayTXTMenuCreator();
        }
        if(Country.equals("US")&&Category.equals("AllDay")&&Format.equals("XML")){
            menuCreatorAbstractFactory=new USAllDayXMLMenuCreator();
        }
        if(Country.equals("US")&&Category.equals("Diner")&&Format.equals("HTML")){
            menuCreatorAbstractFactory=new USDinerHTMLMenuCreator();
        }
        if(Country.equals("US")&&Category.equals("Diner")&&Format.equals("TXT")){
            menuCreatorAbstractFactory=new USDinerTXTMenuCreator();
        }
        if(Country.equals("US")&&Category.equals("Diner")&&Format.equals("XML")){
            menuCreatorAbstractFactory=new USDinerXMLMenuCreator();
        }
        if(Country.equals("US")&&Category.equals("Evening")&&Format.equals("HTML")){
            menuCreatorAbstractFactory=new USEveningHTMLMenuCreator();
        }
        if(Country.equals("US")&&Category.equals("Evening")&&Format.equals("XML")){
            menuCreatorAbstractFactory=new USEveningXMLMenuCreator();
        }
        if(Country.equals("US")&&Category.equals("Evening")&&Format.equals("TXT")){
            menuCreatorAbstractFactory=new USEveningTXTMenuCreator();
        }
        return menuCreatorAbstractFactory;
    }
}
