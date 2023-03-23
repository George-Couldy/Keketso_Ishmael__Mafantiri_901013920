module com.example.mgc_webdev {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.mgc_webdev to javafx.fxml;
    exports com.example.mgc_webdev;
}