/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.finapp.controller;

import cz.finapp.services.Date;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import cz.finapp.services.DateFormatter;
import java.text.ParseException;
import javafx.event.ActionEvent;

/**
 *
 * @author Jenda
 */
public class FXMLDocumentController implements Initializable {
    
    
    
    @FXML
    private Label labelDate;
    
    @FXML
    private Label labelOverall;
        
    @FXML
    private Label labelOverallPrice;
    
    @FXML
    private ComboBox<Integer> cbDay;    
    
    @FXML
    private ComboBox<Integer>  cbMonth;
    
    @FXML
    private ComboBox<Integer>  cbYear;
    
    @FXML
    private Button btnCosts;
    
    @FXML
    private Button btnSearch;
    
    @FXML
    private Button btnInsert;
      
    @FXML
    private Button btnUpdate;
 
    @FXML
    private Button btnDelete;
  
   @FXML
   private TableView costsTableViev;
   

   
   
    
   
   Date date = new Date();


    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    
        int actualDay = date.getActualDay();
        int actualMonth = date.getActualMonth();
        int actualYear = date.getActualYear();
        
        //Vyplní combo boxy
        cbDay.setItems(FXCollections.observableArrayList(date.getDays(actualMonth, actualYear)));
        cbDay.setValue(actualDay);
        cbMonth.setItems(FXCollections.observableArrayList(date.getMonths()));
        cbMonth.setValue(actualMonth);
        cbYear.setItems(FXCollections.observableArrayList(date.getYears()));
        cbYear.setValue(actualYear);
 
    }    
    
    
    @FXML
    private void cbMonthListener()
    {
        cbMonth.setOnAction(new EventHandler() {

            @Override
            public void handle(Event event) {
                
                //Hodnoty z comboboxu
                int monthValue =  cbMonth.getSelectionModel().getSelectedItem().intValue();
                int yearValue  = cbYear.getSelectionModel().getSelectedItem().intValue();

                cbDay.setItems(FXCollections.observableArrayList(date.getDays(monthValue, yearValue)));
                
            }
        });    
        

    }
    
    @FXML
    private void cbYearListener()
    {
        cbYear.setOnAction(new EventHandler() {

            @Override
            public void handle(Event event) {
                
                //Hodnoty z comboboxu
                int monthValue =  cbMonth.getSelectionModel().getSelectedItem().intValue();
                int yearValue  = cbYear.getSelectionModel().getSelectedItem().intValue();

                cbDay.setItems(FXCollections.observableArrayList(date.getDays(monthValue, yearValue)));
                
            }
        });    
        

    }
    
    @FXML
   private void search()
    {

        //Získání aktuálních hodnot z comboboxu
        int dayValue = cbDay.getValue();
        int monthValue = cbMonth.getValue();
        int yearValue = cbYear.getValue();
        
        
        DateFormatter.formatDate(dayValue, 
                                                   monthValue,
                                                   yearValue);
        

    }
    
    
    
    
    
    
}
