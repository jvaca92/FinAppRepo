/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.finapp.entity;

/**
 *
 * @author Johny
 */
public class ResultStatements {
    
    //Atributy
    private long overAllIncome;
    private long overAllCost;
    
    
    public ResultStatements (Long overAllIncome, long overAllCost)
    {
        
        this.overAllCost = overAllCost;
        this.overAllIncome = overAllCost;
    
    }

    /**
     * @return the overAllIncome
     */
    public long getOverAllIncome() {
        return overAllIncome;
    }

    /**
     * @param overAllIncome the overAllIncome to set
     */
    public void setOverAllIncome(long overAllIncome) {
        this.overAllIncome = overAllIncome;
    }

    /**
     * @return the overAllCost
     */
    public long getOverAllCost() {
        return overAllCost;
    }

    /**
     * @param overAllCost the overAllCost to set
     */
    public void setOverAllCost(long overAllCost) {
        this.overAllCost = overAllCost;
    }
    
}
