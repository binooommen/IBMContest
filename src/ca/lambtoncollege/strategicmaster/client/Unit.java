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
    private int team;
    private int amount;
    
    Unit(){
       this.team=0;
       this.amount=0; 
    }
    
    Unit(int team,int amount){
        this.team=team;
        this.amount=amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getTeam() {
        return team;
    }
    
    public void setTeam(int team) {
        this.team = team;
    }
    
    public void add(int amount){
        this.amount+=amount;
    }
    
    public void remove(int amount){
        this.amount-=amount;
    }
    
    public int getHalf(){
        return amount>1 ? amount/2 : amount==1 ? 1 : 0;
    }
    
    public Unit split(int n){
        amount-=n;
        return new Unit(getTeam(),n);
    }
    
    public boolean isEmpty(){
        return amount==0 ;
    }
    
    public int comparedTo(Unit unit){
        return this.amount-unit.getAmount();
    }
    
    public void capture(Base base){
        
    }
}
