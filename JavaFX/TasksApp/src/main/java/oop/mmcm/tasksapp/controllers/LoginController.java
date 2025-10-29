package oop.mmcm.tasksapp.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import oop.mmcm.tasksapp.models.User;
import oop.mmcm.tasksapp.repositories.UserRepository;
import oop.mmcm.tasksapp.utils.PasswordUtils;

public class LoginController extends BaseController {
    private UserRepository userRepository;

    @FXML
    private TextField emailField;

    @FXML
    private PasswordField passwordField;

    public void initialize() {
        this.userRepository = new UserRepository();
    }

    protected void clearFields() {
        this.emailField.clear();
        this.passwordField.clear();
    }

    @FXML
    protected void onLogin() {
        User user = userRepository.findByEmail(emailField.getText());

        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error");
        alert.setHeaderText("Invalid email or password");

        if (user == null) {
            alert.showAndWait();
            return;
        }

        if (!PasswordUtils.verifyPassword(passwordField.getText(), user.getPassword())) {
            alert.showAndWait();
            return;
        }

        this.clearFields();

        // TODO: after login navigate to the main application scene
    }

    @FXML
    protected void onRegister() {
        this.application.goToRegister();
    }
}
