/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package RestaurantMenuCreatorFactory;
import MenuCategoryGenerator.IMenuGenerator;
import MenuReader.*;
import MenuFormatter.*;

/**
 *
 * @author charles
 */
public abstract class MenuCreatorAbstractFactory {
    abstract public IReader createReader();
    abstract public IMenuGenerator createMenuCreator();
    abstract public IMenuFormatter createMenuFormatter();
}
