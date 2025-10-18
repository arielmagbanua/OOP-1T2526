package oop.mmcm.fxml;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.util.Map;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected Map<String, String> myMap;

    @FXML
    public void initialize() {
        System.out.println(myMap);
    }

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}
