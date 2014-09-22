/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package RestaurantMenuCreatorFactory;

import MenuFormatter.IMenuFormatter;
import MenuCategoryGenerator.IMenuGenerator;
import MenuCategoryGenerator.MenuGeneratorFactory;
import MenuFormatter.MenuFormatterFactory;
import MenuReader.IReader;
import MenuReader.MenuReaderFactory;
import MenuReader.XMLReader;

/**
 *
 * @author charles
 */
public class GBAllDayHTMLMenuCreator extends MenuCreatorAbstractFactory{
   
    @Override
    public IReader createReader() {
        return MenuReaderFactory.generateReader("GB");
    }

    @Override
    public IMenuGenerator createMenuCreator() {
        return MenuGeneratorFactory.generateCategoryMenu("AllDay", createReader());
    }

    @Override
    public IMenuFormatter createMenuFormatter() {
        return MenuFormatterFactory.generateFormatter("HTML", createMenuCreator());
    }
    
}
