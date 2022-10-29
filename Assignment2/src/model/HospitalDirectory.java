/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Mayur
 */
public class HospitalDirectory {
    
    private Set<Hospital> hospitals = new HashSet<>();

    public HospitalDirectory() {
        
        int hospitalId = 1001;
        String hospitalName = "Hospital 1";
        String hospitalAddress = "Tremont street";
        long contactNo = Long.parseLong("8573134049");
        String city = City.Boston.toString();
        String community = "Boylston";
                    
        Hospital hospital = new Hospital();
        hospital.setHospitalID(hospitalId);
        hospital.setHospitalName(hospitalName);
        hospital.setHospitalAddress(hospitalAddress);
        hospital.setContactNumber(contactNo);
                    
        Map<String, String> communityMap = new HashMap<>();
        communityMap.put(city,community);
           
        Community c = new Community();
        c.setCommunity(communityMap);
                    
        hospital.setCommunity(c);
        
        this.hospitals.add(hospital);
    }
    
    
    
    

    public Set<Hospital> getHospitals() {
        return hospitals;
    }
    
    public void setHospitals(Hospital hospital) {
        this.hospitals.add(hospital);
    }
    
    public void deleteHospital(Hospital hospital) {
        this.hospitals.remove(hospital);
    }

}
