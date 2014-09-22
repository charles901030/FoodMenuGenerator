/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MenuReader;

import Entities.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

/**
 *
 * @author charles
 */
public class JSONReader implements IReader{

    @Override
      public ArrayList<FoodItem> getReader() {
        ObjectMapper mapper = new ObjectMapper();
        ArrayList<FoodItem> FoodItemList=new ArrayList<FoodItem>();
        try {
           Map<String, Object> jsonMap = mapper.readValue(new File("FoodItemData.json"), Map.class);
           ArrayList<Object> foodData = (ArrayList<Object>)jsonMap.get("FoodItemData");
           for(int i=0;i<foodData.size();i++){
                     HashMap map= (HashMap)foodData.get(i);
                     String country=map.get("-country").toString();
               if(country.equals("US")){
                    FoodItem fooditem=new FoodItem();
                    fooditem.setId(Integer.parseInt(map.get("id").toString()));
                    fooditem.setName(map.get("name").toString());
                    fooditem.setCategory(map.get("category").toString());
                    fooditem.setDescription(map.get("description").toString());
                    fooditem.setPrice(Double.parseDouble(map.get("price").toString()));
                    fooditem.setCountry(country);
                    FoodItemList.add(fooditem);
               }
                  
           }      
          
        } catch (JsonGenerationException e) {

            e.printStackTrace();

        } catch (JsonMappingException e) {

            e.printStackTrace();

        } catch (IOException e) {

            e.printStackTrace();

        }
      return FoodItemList;
    }
    
}
