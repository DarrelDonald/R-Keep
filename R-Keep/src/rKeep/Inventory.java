/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rKeep;

import java.util.List;

/**
 *
 * @author shadows97_7
 */
public class Inventory {
    private List<InventoryNode> records;
    Inventory(){
        
    }
    public void addRecord(String item, String quantity, String location){
        records.add(new InventoryNode(item,quantity,location));
    }
    public void display(){
        int x=1;
        for(InventoryNode i : records){
            System.out.println((x++)+") \nItem: "+i.item);
            System.out.println("quantity: "+i.quantity);
            System.out.println("location: "+i.location+"\n");
        }
    }
}
