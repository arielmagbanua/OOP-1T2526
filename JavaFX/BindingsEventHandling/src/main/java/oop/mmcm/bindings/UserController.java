package oop.mmcm.bindings;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class UserController {
    @FXML
    protected TextField emailField;

    @FXML
    protected PasswordField passwordField;

    protected Alert alert;

    public void initialize() {
        this.alert = new Alert(Alert.AlertType.NONE);
    }

    @FXML
    protected void onLogin() {
        // get the email and password from the field objects
        String email = this.emailField.getText();
        String password = this.passwordField.getText();

        if (email.equals("ariel@test.com") && password.equals("1234")) {
            // prepare alert for successful login
            this.alert.setAlertType(Alert.AlertType.INFORMATION);
            this.alert.setTitle("Authentication");
            this.alert.setHeaderText("Login successful");
        } else {
            // prepare alert for failed login
            this.alert.setAlertType(Alert.AlertType.ERROR);
            this.alert.setTitle("Authentication");
            this.alert.setHeaderText("Login failed");
        }

        // show the alert
        this.alert.showAndWait();
    }
}
