/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rKeep;

import java.util.Scanner;

/**
 *
 * @author shadows97_7
 */
public class UserInterface {
    UserInterface(){
        
    }
    public boolean login(String username, String password){
        return rKeep.opperator.verify(username, password);
    }
    
    
    
    
    
    public void run(){
        Scanner scan =  new Scanner(System.in);
        boolean valid,terminate;
        int choice;
        //correct username: example
        //corrext password: employee
        System.out.println("Enter username: ");
        String username=scan.next();
        System.out.println("Enter password: ");
        String password=scan.next();
        while(!login(username, password)){
            System.out.println("Invalid credintials. Please try again.");
            System.out.println("Enter username: ");
            username=scan.next();
            System.out.println("Enter password: ");
            password=scan.next();
        }
        terminate=false;
        while (!terminate){
            valid=false;
            while(!valid){
                System.out.println("What would you like to keep track of today?");
                System.out.println("1) Fuel Sales\n\n2) Traffic Reports\n\n3) Inventory\n\n4) Cancel");
                choice=scan.nextInt();
                switch (choice){
                    case 1:
                        //opperator.openFuelSales();
                        valid=true;
                        break;
                    case 2:
                        //opperator.openTrafficReports();
                        valid=true;
                        break;
                    case 3:
                        //opperator.openInventory();
                        valid=true;
                        break;
                    case 4:
                        System.out.println("Canceling");
                        terminate=true;
                        valid=true;
                        break;
                    default:
                        System.out.println("Please enter a valid nummber.");
                        break;
                }
            }
            
        }
    }
}
