/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.finapp.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author Jenda
 */
public class DateFormatter {
    
    
     static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
   
    /**
     *  Naformátuje hodnoty z comboboxu
     * @return 
     */
    public static String formatDate( int dayValue, int monthValue, int yearValue) 
    {

      String joinDate = String.valueOf(dayValue) + "/"
                              + String.valueOf(monthValue) + "/"
                              + String.valueOf(yearValue);
         
      
        System.out.println(joinDate);

        return null;
    }
}
