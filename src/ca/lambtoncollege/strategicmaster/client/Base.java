/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ca.lambtoncollege.strategicmaster.client;

import java.util.LinkedList;

/**
 *
 * @author alpenliebe
 */
public class Base {
    private int team;
    private LinkedList baseList = null;
    private Unit unit;
    
    Base(){
        this.team=0;
        this.baseList = new LinkedList();
        this.unit=new Unit();
    }
    
    Base(int amount){
        this();
        this.unit.setAmount(amount);
    }
    
}
