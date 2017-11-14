/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rKeep;

import java.util.Dictionary;

/**
 *
 * @author shadows97_7
 */
public class Profiles {
    private Dictionary<String,String> table;
    private Profiles() {
        table.put("example", "employee");
    }
    public boolean verify(String username, String password){
        return (password.matches(table.get(username)));
    }
}
