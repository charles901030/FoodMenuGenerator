/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MenuReader;
import Entities.*;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;
import java.util.ArrayList;
/**
 *
 * @author charles
 */
public class XMLReader implements IReader{

    ArrayList<FoodItem> foodItemList  =new ArrayList<FoodItem> ();
    @Override
    public ArrayList<FoodItem> getReader(){
    try {
	File fXmlFile = new File("FoodItemData.xml");
	DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
	Document doc = dBuilder.parse(fXmlFile);
	doc.getDocumentElement().normalize(); 
	System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
	NodeList nList = doc.getElementsByTagName("FoodItem");
	for (int temp = 0; temp < nList.getLength(); temp++) {
		Node nNode = nList.item(temp);
		if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                        FoodItem foodItem=new FoodItem();
			Element eElement = (Element) nNode;
                        String country=eElement.getAttribute("country");
                        String id=eElement.getElementsByTagName("id").item(0).getTextContent();
                        String name=eElement.getElementsByTagName("name").item(0).getTextContent();
		        String description=eElement.getElementsByTagName("description").item(0).getTextContent();
                        String category=eElement.getElementsByTagName("category").item(0).getTextContent();
		        String price=eElement.getElementsByTagName("price").item(0).getTextContent();
                        if(country.equals("GB")){
                           foodItem.setId(Integer.parseInt(id));
                           foodItem.setDescription(description);
                           foodItem.setCategory(category);
                           foodItem.setPrice(Double.parseDouble(price));
                           foodItem.setName(name);
                           foodItem.setCountry("GB");
                           foodItemList.add(foodItem);
                        }
                      
		}
	}
    } catch (Exception e) {
	e.printStackTrace();
    }
    return foodItemList;
  }
    
    
}
