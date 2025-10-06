package oop.demo.demo;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

import java.awt.*;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private ComboBox<Color> colorsComboBox;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}
