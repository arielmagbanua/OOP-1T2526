package oop.mmcm.tasksapp.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class RegisterController extends BaseController {
    @FXML
    private TextField firstNameField;

    @FXML
    private TextField lastNameField;

    @FXML
    private TextField emailField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private PasswordField confirmPasswordField;

    public void initialize() {
        // set the confirm-password field listener, to listen for changes
        this.confirmPasswordField.textProperty().addListener((observable, oldValue, newValue) -> {
            if (!newValue.equals(this.passwordField.getText()) && !this.passwordField.getText().isEmpty()) {
                if (!this.passwordField.getStyleClass().contains("invalid-field")) {
                    this.passwordField.getStyleClass().add("invalid-field");
                }
            } else {
                this.passwordField.getStyleClass().remove("invalid-field");
            }
        });
    }

    private void clearAllFields() {
        this.firstNameField.clear();
        this.lastNameField.clear();
        this.emailField.clear();
        this.passwordField.clear();
        this.confirmPasswordField.clear();
    }

    @FXML
    protected void onSave() {
        // TODO: save the user

        this.clearAllFields();
        this.application.goToLogin();
    }

    @FXML
    protected void onCancel() {
        this.clearAllFields();
        this.application.goToLogin();
    }
}
