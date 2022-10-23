package com.example.storehaus;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class WorkersController implements Initializable {

    @FXML
    private MenuItem createNewAcc;
    @FXML
    private TableView<User> table;
    @FXML
    private TableColumn<User, String> firstnameID;

    @FXML
    private TableColumn<User, String> lastnameID;

    @FXML
    private TableColumn<User, Integer> lastLineID;

    @FXML
    private TableColumn<User, Integer> nubOfLinID;

    @FXML
    private TableColumn<User, String> passwordID;

    @FXML
    private TableColumn<User, String> usernameID;


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

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        DatabaseHandler dbHandler = new DatabaseHandler();
        firstnameID.setCellValueFactory(new PropertyValueFactory<User, String>("firstName"));
        lastnameID.setCellValueFactory(new PropertyValueFactory<User, String>("lastName"));
        usernameID.setCellValueFactory(new PropertyValueFactory<User, String>("userName"));
        passwordID.setCellValueFactory(new PropertyValueFactory<User, String>("password"));
        nubOfLinID.setCellValueFactory(new PropertyValueFactory<User, Integer>("number of lines"));
        lastLineID.setCellValueFactory(new PropertyValueFactory<User, Integer>("last line"));

        // table.setItems(dbHandler.getUser());
    }
}