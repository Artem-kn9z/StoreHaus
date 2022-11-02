package com.example.storehaus;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class InformationWindowController {

    @FXML
    private Label informationText;

    @FXML
    private Button okBatton;

    public void setInformationText(String informationText1) {
        this.informationText.setText(informationText1);
    }

    @FXML
    void okButton1() {
         okBatton.getScene().getWindow().hide();
    }

}
