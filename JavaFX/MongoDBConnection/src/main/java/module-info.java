module oop.mmcm.registration {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.mongodb.driver.sync.client;


    opens oop.mmcm.registration to javafx.fxml;
    exports oop.mmcm.registration;
    exports oop.mmcm.registration.controllers;
    opens oop.mmcm.registration.controllers to javafx.fxml;
}