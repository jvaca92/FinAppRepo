/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.finapp.services;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javafx.collections.ObservableList;

/**
 *
 * @author Johny
 */
public class Date {

    
    //Atributy
    private int day = 1;
    private int month;
    private int year;
    
    Calendar cl = Calendar.getInstance();
    
    /**  Vrací počet dní v danym měsíci
     * @param day   
     * @param year
     * @return 
    */
    
    public ArrayList<Integer> getDays(int month, int year) throws NullPointerException
    {
        ArrayList<Integer> listOfDays = new ArrayList <Integer>();
        Calendar clGre = new GregorianCalendar(year, month, this.day);
        
        try {
        
        int count = clGre.getActualMaximum(Calendar.DAY_OF_MONTH);
        //Zavolání cyklu
        listOfDays = fillList(count);
        
        } catch (Exception ex) {
        
            ex.printStackTrace();
        }

        return listOfDays;
    }
    
    /**
     *  Získá list měsíců
     * @return 
     */
    public ArrayList<Integer> getMonths()
    {
    
        ArrayList<Integer> listOfMonths = new ArrayList<Integer>();
        
        try {
        listOfMonths = fillList(12);
    
        } catch(Exception ex) {
            
            ex.printStackTrace();
        }
    return listOfMonths;
    }
    
    
    /**
     *  Získá list roků
     * @return 
     */
    public ArrayList<Integer> getYears()
    {
    
        ArrayList<Integer> listOfYears = new ArrayList<Integer>();
        
         for(int i = 1999; i <= 2020; i++)
        {   
            listOfYears.add(i);
        }
    return listOfYears;
    }
    /**
     * 
     * @return 
     */
    public int getActualDay()
    {
        int actualDay = cl.get(Calendar.DAY_OF_MONTH);
        
        return actualDay;
    }
    
    /**
     * 
     * @return 
     */
    
      public int getActualMonth()
    {
        int actualMonth = cl.get(Calendar.MONTH) +1;
        
        return  actualMonth;
    }
      
    
    /**
     * 
     * @return 
     */   
    public int getActualYear()
    {
        int actualYear = cl.get(Calendar.YEAR);
        
        return  actualYear;
    }
    
    
    
    
    
    
    
    
    
    
    
    /**
     *  Metoda generující čísla
     * @param count
     * @return 
     */
    private ArrayList<Integer> fillList(int count)
    {
        ArrayList<Integer> numberList = new ArrayList<Integer>();
        
        //Pročistit seznam
        numberList.clear();
        
        for(int i = 1; i <= count; i++)
        {   
            numberList.add(i);
        }
        
        return  numberList;
    }
    
    
}