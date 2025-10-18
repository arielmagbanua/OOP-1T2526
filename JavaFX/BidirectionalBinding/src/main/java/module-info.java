module oop.mmcm.bidirectionalbinding {
    requires javafx.controls;
    requires javafx.fxml;


    opens oop.mmcm.bidirectionalbinding to javafx.fxml;
    exports oop.mmcm.bidirectionalbinding;
    exports oop.mmcm.bidirectionalbinding.controllers;
    opens oop.mmcm.bidirectionalbinding.controllers to javafx.fxml;
}