/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Mayur
 */
public class Community{
      
    
    EnumMap<City, String[]> LstCommunity = new EnumMap<>(City.class);
    Map<String, String> Community = new HashMap<>();
    
    public EnumMap<City, String[]> getLstCommunity() {
        return LstCommunity;
    }

    public void setLstCommunity() {
        LstCommunity.put(City.NewYork, new String[]{"Brooklyn", "Manhattan", "Queens", "NYC", });
        LstCommunity.put(City.Boston, new String[]{"Northeastern University", "Prudential", "Riverway", "Symphony"});
        LstCommunity.put(City.California, new String[]{"Los Angeles", "Long Beach", "San Diego"});
        LstCommunity.put(City.Austin, new String[]{"Downtown", "Urban", "wallis"});
    }

    public Map<String, String> getCommunity() {
        return Community;
    }

    public void setCommunity(Map<String, String> Community) {
        this.Community = Community;
    }
}
