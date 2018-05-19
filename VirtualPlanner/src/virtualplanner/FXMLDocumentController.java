/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package virtualplanner;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author Saipranav
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    private ComboBox comboBox = new ComboBox<String>();
    private TextField EventName = new TextField();
      private TextField TimeOfEvent = new TextField();
      private TextField PrepTime = new TextField();
    
    @FXML
    private void speakBttnAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("123456789!");
    }
    
    @FXML
    private void submitBttnAction(ActionEvent event) {
       String Event;
        Event = EventName.getText();
        String Time;
        Time = TimeOfEvent.getText();
        String Prep = PrepTime.getText();
 
    }
   


    
    @FXML
    public void initialize(URL url, ResourceBundle rb) {
  //  comboBox.getItems().addAll("Homework", "Test", "Commitment");
    //comboBox.getSelectionModel().select("Homework");
    }
}
