/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.finapp.controller;

import com.sun.javafx.property.adapter.PropertyDescriptor;
import cz.finapp.services.Date;
import java.net.URL;
import java.util.Calendar;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;

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
    private ChoiceBox chbDay;    
    
    @FXML
    private ChoiceBox chbMonth;
    
    @FXML
    private ChoiceBox chbYear;
    
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
        
        //Vyplní choice box  
        chbDay.setItems(FXCollections.observableArrayList(date.getDays(actualMonth - 1, actualYear)));
        chbDay.setValue(actualDay);
        chbMonth.setItems(FXCollections.observableArrayList(date.getMonths()));
        chbMonth.setValue(actualMonth);
        chbYear.setItems(FXCollections.observableArrayList(date.getYears()));
        chbYear.setValue(actualYear);
    }    
    
    
    @FXML
    private void choiceBoxListener()
    {
        chbMonth.getSelectionModel().selectedItemProperty().addListener(new ChangeListener() {

            @Override
            public void changed(ObservableValue observable, Object oldValue, Object newValue) {
                
                
                int monthValue = (Integer) oldValue;
                
                System.out.println(monthValue);
                
                chbDay.setItems(FXCollections.observableArrayList(date.getDays(monthValue, 2015)));
                
            }
        });
        
        
    }
    
    
    
    
    
}
