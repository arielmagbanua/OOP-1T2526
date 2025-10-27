module oop.mmcm.tasksapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens oop.mmcm.tasksapp to javafx.fxml;
    exports oop.mmcm.tasksapp;
    exports oop.mmcm.tasksapp.controllers;
    opens oop.mmcm.tasksapp.controllers to javafx.fxml;
}