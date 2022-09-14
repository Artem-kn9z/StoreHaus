module com.example.storehaus {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.storehaus to javafx.fxml;
    exports com.example.storehaus;
}