package com.example.storehaus;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;

import java.io.IOException;

public class WorkersController {

    @FXML
    private MenuItem createNewAcc;
    @FXML
    private TableColumn<?, ?> firstnameID;

    @FXML
    private TableColumn<?, ?> lastnameID;

    @FXML
    private TableColumn<?, ?> llID;

    @FXML
    private TableColumn<?, ?> nolID;

    @FXML
    private TableColumn<?, ?> passwordID;

    @FXML
    private TableColumn<?, ?> usernameID;

    @FXML
    private MenuItem workWithStorehaus;

    @FXML
    void createNewAcc1(ActionEvent event) {
        FxmlLoader fxmlLoader2 = new FxmlLoader();
        try {
            fxmlLoader2.fxmlLoader("createNewAcc.fxml");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    void workiWithStorehaus11() {
            workWithStorehaus.setOnAction(event -> {
                //workWithStorehaus.getScene().getWindow().hide();
                FxmlLoader fxmlLoader1 = new FxmlLoader();
                try {
                 fxmlLoader1.fxmlLoader("StorehausMenu.fxml");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });
    }
}