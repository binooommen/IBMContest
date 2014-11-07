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
public class Base extends Node {
    private int team;
    private LinkedList baseList = null;
    private Unit unit;
    
    Base(){
        this.team=0;
        this.baseList = new LinkedList();
        this.unit=new Unit();
    }
    
    Base(int amount){
        this.team=0;
        this.baseList = new LinkedList();
        this.unit=new Unit(this.team,amount);
    }
    
    Base(int team,int amount){
        this.team=team;
        this.baseList = new LinkedList();
        this.unit=new Unit(team,amount);
    }

    public void setTeam(int team) {
        this.team = team;
        this.unit.setTeam(team);
    }
    
    public boolean isEmpty(){
        return this.unit.isEmpty();
    }
    
    public void enter(Unit newUnit){
        if(this.unit.getTeam()==newUnit.getTeam()){
            this.unit.add(newUnit.getAmount());
        } else {
            int amount = this.unit.comparedTo(newUnit);
            if(amount < 0) setTeam(newUnit.getTeam());
            this.unit.setAmount((amount < 0) ? -amount : amount);
        }
    }
    
    public Unit select(boolean selectAll){
        return selectAll ? this.unit.split(this.unit.getAmount()) : this.unit.split(this.unit.getHalf());
    }
    
    public void release(Unit newUnit){
       this.unit.add(newUnit.getAmount());
    }
}
