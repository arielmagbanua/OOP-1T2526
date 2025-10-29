package oop.mmcm.tasksapp.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import oop.mmcm.tasksapp.models.User;
import oop.mmcm.tasksapp.repositories.BaseRepository;
import oop.mmcm.tasksapp.repositories.UserRepository;
import oop.mmcm.tasksapp.utils.PasswordUtils;

public class RegisterController extends BaseController {
    private BaseRepository<User> userRepository;

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
        this.userRepository = new UserRepository();

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
        if (this.emailField.getText().isEmpty()) {
            // show error dialog here
            return;
        }

        // hash the password before saving
        String hashedPassword = PasswordUtils.hashPassword(this.passwordField.getText());

        User user = new User();
        user.setFistName(this.firstNameField.getText());
        user.setLastName(this.lastNameField.getText());
        user.setEmail(this.emailField.getText());
        user.setPassword(hashedPassword);

        this.userRepository.insert(user);

        this.clearAllFields();
        this.application.goToLogin();
    }

    @FXML
    protected void onCancel() {
        this.clearAllFields();
        this.application.goToLogin();
    }
}
