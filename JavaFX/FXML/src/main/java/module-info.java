module oop.mmcm.fxml {
    requires javafx.controls;
    requires javafx.fxml;


    opens oop.mmcm.fxml to javafx.fxml;
    exports oop.mmcm.fxml;
}