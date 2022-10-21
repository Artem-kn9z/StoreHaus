package com.example.storehaus;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.io.IOException;

public class CreateNewAccController {

    @FXML
    private Button createAccButton;

    @FXML
    private TextField fnID;

    @FXML
    private TextField lnID;

    @FXML
    private TextField psID;

    @FXML
    private TextField unID;

    public String InformationText(){
        return "Created new account: Firstname " + fnID.getText() + "Lastname "
                + lnID.getText() + "Password " + psID.getText()+ "UserName " + unID.getText();
    }

    @FXML
    void createAccButton1(ActionEvent event) {
//        DatabaseHandler dbHandler = new DatabaseHandler();
//        dbHandler.singUpUser(fnID.getText(),lnID.getText(),psID.getText(),unID.getText());
        createAccButton.getScene().getWindow().hide();

        InformationWindowController informationWindowController = new InformationWindowController();
        informationWindowController.setInformationText("lol");

        FxmlLoader fmxlLoader1 = new FxmlLoader();
        try {
            fmxlLoader1.fxmlLoader("informationWindow.fxml");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
