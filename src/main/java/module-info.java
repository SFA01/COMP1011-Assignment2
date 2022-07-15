module ca.georgiancollege.comp1011assignment2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens ca.georgiancollege.comp1011assignment2 to javafx.fxml;
    exports ca.georgiancollege.comp1011assignment2;
}