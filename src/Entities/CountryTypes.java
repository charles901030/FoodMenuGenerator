/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

/**
 *
 * @author charles
 */
public enum CountryTypes {
        
    GB("Great Britain"),
    US("United States");
    
    private String country;
     
    CountryTypes(String country){
        this.country = country;
    }
    public String getCountry(){
        return this.country;
    }
}
