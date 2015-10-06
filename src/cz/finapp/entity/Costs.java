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
public class Costs {
    
    //Atributy
    private String costName;
    private Date date;
    private int price;
    private long overAll;
    
    
    public Costs(){
        
    }
    
    public Costs(String costName, Date date, long overAll, int price){
        
        this.costName = costName;
        this.date = date;
        this.overAll = overAll;
        this.price = price;
    }
    
  
    
    
    
    
    //Gettery a Settery
    /**
     * @return the costName
     */
    public String getCostName() {
        return costName;
    }

    /**
     * @param costName the costName to set
     */
    public void setCostName(String costName) {
        this.costName = costName;
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
     * @return the overall
     */
    public long getOverall() {
        return overAll;
    }

    /**
     * @param overall the overall to set
     */
    public void setOverall(long overAll) {
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
