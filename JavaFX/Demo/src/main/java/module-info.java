module oop.demo.demo {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens oop.demo.demo to javafx.fxml;
    exports oop.demo.demo;
}