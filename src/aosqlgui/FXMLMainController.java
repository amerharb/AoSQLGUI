/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aosqlgui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

/**
 *
 * @author amharb
 */
public class FXMLMainController implements Initializable {
    
    @FXML
    private TextArea txtCommand, txtResult;

    @FXML
    private void handleBtnSendAction(ActionEvent event) {
        txtCommand.setText("Hello Command!");
        txtResult.setText("Hello Results!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
