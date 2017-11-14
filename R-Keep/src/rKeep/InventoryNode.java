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
public class InventoryNode {
    String item;
    String quantity;
    String location;
    InventoryNode(){
        
    }
    InventoryNode(String item, String quantititty, String location){
        this.item=item;
        this.quantity=quantititty;
        this.location=location;
    }
}
