module oop.mmcm.scenes {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.base;

    opens oop.mmcm.scenes to javafx.fxml;
    exports oop.mmcm.scenes;
    exports oop.mmcm.scenes.controllers;
    opens oop.mmcm.scenes.controllers to javafx.fxml;
}