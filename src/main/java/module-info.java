module ca.georgiancollege.comp1011assignment2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ca.georgiancollege.comp1011assignment2 to javafx.fxml;
    exports ca.georgiancollege.comp1011assignment2;
}