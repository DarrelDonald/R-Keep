/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rKeep;

/**
 *
 * @author shadows97_7
 */
public class Opperator {
    Profiles profiles;
    FuelSales fuelSales;
    TrafficReports trafficReports;
    Opperator(){
        
    }
    public boolean verify(String username, String password){
        return profiles.verify(username, password);
    }
    public void openInventory(){
        //display inventory and provide options for managing it
    }
    public void openFuelSales(){
        //display fuel sales and provide options for managing them
    }
    public void openTrafficReports(){
        //display traffic reports and provide options for managing them
    }
}
