package oop.mmcm.tasksapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import oop.mmcm.tasksapp.controllers.BaseController;

import java.io.IOException;

public class TasksApplication extends Application {
    private Stage mainStage;

    private Scene loginScene;

    private Scene registerScene;

    @Override
    public void start(Stage stage) throws IOException {
        // set the main
        this.mainStage = stage;

        // prepare the login scene
        FXMLLoader loginLoader = new FXMLLoader(TasksApplication.class.getResource("login.fxml"));
        this.loginScene = new Scene(loginLoader.load(), 320, 140);
        // get the login controller and set the application reference
        BaseController loginController = loginLoader.getController();
        loginController.setApplication(this);

        // set the login as the initial scene
        stage.setTitle("Login");
        stage.setScene(this.loginScene);
        stage.show();

        // prepare the register scene
        FXMLLoader registerLoader = new FXMLLoader(TasksApplication.class.getResource("register.fxml"));
        this.registerScene = new Scene(registerLoader.load(), 400, 300);
        this.registerScene.getStylesheets().add(TasksApplication.class.getResource("styles.css").toExternalForm());
        // get the register controller and set the application reference
        BaseController registerController = registerLoader.getController();
        registerController.setApplication(this);
    }

    public void goToRegister() {
        this.mainStage.setTitle("Register");
        this.mainStage.setScene(this.registerScene);
    }

    public void goToLogin() {
        this.mainStage.setTitle("Login");
        this.mainStage.setScene(this.loginScene);
    }
}
