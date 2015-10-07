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
    
    
    
    /**  Vrací počet dní v danym měsíci
     * @param day   
     * @param year
     * @return 
    */
    
    public ArrayList<Integer> getDays(int month, int year) 
    {
        ArrayList<Integer> listOfDays = new ArrayList <Integer>();
        Calendar cl = new GregorianCalendar(this.day, month, year);
        
        int count = cl.getActualMaximum(Calendar.DAY_OF_MONTH);
        
        //Zavolání cyklu
        
        
        
//        //Podmínka přestupního roku, měsíci únor se přidá o jeden den navíc
//        if(((year % 4 == 0 ) && (year % 100 != 0) || (year % 400 == 0)) && month == 2)
//        {
//            listOfDays = fillList(29);
//        }
//        else {
            
            
            
        
        
        
        return listOfDays;
    }
    
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