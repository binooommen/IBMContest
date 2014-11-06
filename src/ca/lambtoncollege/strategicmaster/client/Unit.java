/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ca.lambtoncollege.strategicmaster.client;

/**
 *
 * @author alpenliebe <alpseinstein@gmail.com>
 */
public class Unit {
    private int amount;
    
    Unit(){
       this.amount=0; 
    }
    
    Unit(int amount){
        this.amount=amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    
    public void add(int amount){
        this.amount-=amount;
    }
    
    public void remove(int amount){
        this.amount-=amount;
    }
    
    public int comparedTo(Unit unit){
        return this.amount-unit.getAmount();
    }
}
