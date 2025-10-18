package oop.mmcm.bindings;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class UserApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        // load the FXML view of the scene using FXML Loader
        FXMLLoader fxmlLoader = new FXMLLoader(UserApplication.class.getResource("login.fxml"));

        // Create the scene and pass on the view using the load method
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);

        // set the title of the stage
        stage.setTitle("Login");

        // set the scene to display
        stage.setScene(scene);

        // show the stage
        stage.show();
    }
}
