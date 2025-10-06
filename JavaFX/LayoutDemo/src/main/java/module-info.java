module oop.mmcm.layoutdemo {
    requires javafx.controls;
    requires javafx.fxml;


    opens oop.mmcm.layoutdemo to javafx.fxml;
    exports oop.mmcm.layoutdemo;
}