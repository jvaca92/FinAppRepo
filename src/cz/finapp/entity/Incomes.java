/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.finapp.entity;

import java.util.Date;

/**
 *
 * @author Johny
 */
public class Incomes {
    
     //Atributy
    private String incomeName;
    private Date date; 
    private int price;
    private long overAll;
    
    
    public Incomes(){
        
    }
    
    public Incomes(String incomeName, Date date, long overAll, int price){
        
        this.incomeName = incomeName;
        this.date = date;
        this.price = price;
        this.overAll = overAll;
    }

    /**
     * @return the incomeName
     */
    public String getIncomeName() {
        return incomeName;
    }

    /**
     * @param incomeName the incomeName to set
     */
    public void setIncomeName(String incomeName) {
        this.incomeName = incomeName;
    }

    /**
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * @return the overAll
     */
    public long getOverAll() {
        return overAll;
    }

    /**
     * @param overAll the overAll to set
     */
    public void setOverAll(long overAll) {
        this.overAll = overAll;
    }

    /**
     * @return the price
     */
    public int getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(int price) {
        this.price = price;
    }
    
    
}
