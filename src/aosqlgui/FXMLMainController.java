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
import aosqldriver.AoSQLConnector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author amharb
 */
public class FXMLMainController implements Initializable {

    @FXML
    private TextArea txtCommand, txtResult;

    AoSQLConnector conn = new AoSQLConnector();

    @FXML
    private void handleBtnConnectAction(ActionEvent event) {
        conn.connect();
    }

    @FXML
    private void handleBtnSendAction(ActionEvent event) {
        txtCommand.setText(conn.test());
        txtResult.setText(conn.test());
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

}
