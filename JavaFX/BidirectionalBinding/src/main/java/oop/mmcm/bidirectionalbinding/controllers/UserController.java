package oop.mmcm.bidirectionalbinding.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import oop.mmcm.bidirectionalbinding.models.User;

public class UserController {
    @FXML
    private TextField emailField;

    @FXML
    private PasswordField passwordField;

    private User user = new User();

    private Alert alert = new Alert(Alert.AlertType.NONE);

    public void initialize() {
        this.emailField.textProperty().bindBidirectional(user.emailProperty());
        this.passwordField.textProperty().bindBidirectional(user.passwordProperty());
    }

    @FXML
    protected void onLogin() {
        if (this.user.getEmail().equals("test@tester.com") && this.user.getPassword().equals("1234")) {
            alert.setAlertType(Alert.AlertType.INFORMATION);
            alert.setHeaderText("Logged Successfully");
            alert.showAndWait();
        } else {
            this.user.setEmail("");
            this.user.setPassword("");

            alert.setAlertType(Alert.AlertType.ERROR);
            alert.setHeaderText("Login Failed!");
            alert.showAndWait();
        }
    }

    @FXML
    protected void onClose(ActionEvent event) {
        Node source = (Node) event.getSource();

        Stage window = (Stage) source.getScene().getWindow();
        window.close();
    }
}
