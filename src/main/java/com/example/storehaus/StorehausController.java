package com.example.storehaus;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;



public class StorehausController {
    @FXML
    private Label welcomeText;
    @FXML
    private Label BayText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
    @FXML
    protected void onBayButtonClick() {welcomeText.setText("Don't touch me!");
    }

    public void closeProgram(ActionEvent actionEvent) {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}