package com.example.storehaus;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class SingUpController {

    @FXML
    private TextField Login;

    @FXML
    private PasswordField PasswordField;

    @FXML
    private MenuItem close;

    @FXML
    private Button sinnUpButton;

    @FXML
    void closeProgram() {
        sinnUpButton.setOnAction(event -> {
            System.out.println("You are lol");
        });
    }

    @FXML
    void sinnUpButton1() {
        sinnUpButton.setOnAction(event -> {
            System.out.println("You are lol");
        });
    }

}
