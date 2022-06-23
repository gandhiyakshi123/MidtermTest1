module com.example.midtermtest1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.midtermtest1 to javafx.fxml;
    exports com.example.midtermtest1;
}