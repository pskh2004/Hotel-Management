module org.example.hotelmanagmentsystem {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens org.example.hotelmanagmentsystem to javafx.fxml;
    exports org.example.hotelmanagmentsystem;
}