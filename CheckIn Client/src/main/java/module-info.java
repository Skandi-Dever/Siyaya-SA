module com.skandidever.checkinclient {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.skandidever.checkinclient to javafx.fxml;
    exports com.skandidever.checkinclient;
}