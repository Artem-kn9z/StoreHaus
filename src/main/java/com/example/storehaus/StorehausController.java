package com.example.storehaus;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

import java.io.IOException;

public class StorehausController {

    @FXML
    private MenuItem close;

    @FXML
    private Button workingWithStorehausButton;

    @FXML
    private Button workingWithWorkersButton;

    @FXML
    void closeProgram(ActionEvent event) {

    }
    @FXML
    void workingWithWorkersButton1() {
        workingWithWorkersButton.setOnAction(event -> {
            workingWithWorkersButton.getScene().getWindow().hide();
            //FxmlLoader fxmlLoader1 = new FxmlLoader();
            //fxmlLoader1.fxmlLoader("workingWithWorkers.fxml");
            FXMLLoader loader1 = new FXMLLoader();
            loader1.setLocation(getClass().getResource("workingWithWorkers.fxml"));

            try {
                loader1.load();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            Parent root = loader1.getRoot();
            Stage stage1 = new Stage();
            stage1.setScene(new Scene(root));
            stage1.showAndWait();
        });
    }

}
