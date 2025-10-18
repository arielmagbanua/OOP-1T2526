module oop.mmcm.bindings {
    requires javafx.controls;
    requires javafx.fxml;


    opens oop.mmcm.bindings to javafx.fxml;
    exports oop.mmcm.bindings;
}