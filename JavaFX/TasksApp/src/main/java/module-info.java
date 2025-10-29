module oop.mmcm.tasksapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.mongodb.bson;
    requires org.mongodb.driver.sync.client;
    requires org.mongodb.driver.core;
    requires jbcrypt;

    opens oop.mmcm.tasksapp to javafx.fxml;
    exports oop.mmcm.tasksapp;
    exports oop.mmcm.tasksapp.controllers;
    opens oop.mmcm.tasksapp.controllers to javafx.fxml;
}