package com.example.storehaus;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.sql.SQLException;

public class SingUpController {

    @FXML
    private TextField Login;

    @FXML
    private Label errorEnter;

    @FXML
    private PasswordField PasswordField;

    @FXML
    private Button singUpButton;

    @FXML
    void singUpButton1() {
        singUpButton.setOnAction(event -> {
            String loginText = Login.getText().trim();
            String loginPassword = PasswordField.getText().trim();
            if(!loginText.equals("") && !loginPassword.equals("")){
                //if(loginText.equals("admin") && loginPassword.equals("12345")){
                    loginAdmin(loginText, loginPassword);//}
            }else  errorEnter.setText("Login and password is empty");


        });
    }

    private void loginAdmin(String loginText, String loginPassword) {
        singUpButton.getScene().getWindow().hide();
        FxmlLoader fxmlLoader = new FxmlLoader();
        fxmlLoader.fxmlLoader("hello-view.fxml");
    }

}
