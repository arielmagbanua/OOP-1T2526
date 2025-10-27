package oop.mmcm.tasksapp.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController extends BaseController {
    @FXML
    private TextField emailField;

    @FXML
    private PasswordField passwordField;

    @FXML
    protected void onLogin() {

    }

    @FXML
    protected void onRegister() {
        this.application.goToRegister();
    }
}
