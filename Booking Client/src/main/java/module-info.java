module com.skandidever.bookingclient {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.skandidever.bookingclient to javafx.fxml;
    exports com.skandidever.bookingclient;
}