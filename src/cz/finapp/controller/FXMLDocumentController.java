/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.finapp.controller;

import java.net.URL;
import java.util.ResourceBundle;
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
   
   
   
   

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
}
