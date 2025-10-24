package oop.mmcm.scenes;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import oop.mmcm.scenes.controllers.ScenesController;

import java.io.IOException;

public class ScenesApplication extends Application {
    protected int page = 1;
    protected final int MAX_PAGE = 3;

    private Stage mainStage;

    // pages
    private Scene page1;
    private Scene page2;
    private Scene page3;

    @Override
    public void start(Stage stage) throws IOException {
        // set the app stage as main stage
        this.mainStage = stage;

        // the starting or initial scene
        FXMLLoader mainFxmlLoader = new FXMLLoader(ScenesApplication.class.getResource("scenes-view.fxml"));
        Scene initialScene = new Scene(mainFxmlLoader.load(), 320, 240);

        ScenesController controller = mainFxmlLoader.getController();
        // give the scenes controller a reference to this application
        controller.setApplication(this);

        // initialize page 1
        FXMLLoader page1FxmlLoader = new FXMLLoader(ScenesApplication.class.getResource("page1-view.fxml"));
        this.page1 = new Scene(page1FxmlLoader.load(), 480, 200);
        ScenesController page1Controller = page1FxmlLoader.getController();
        page1Controller.setApplication(this);

        // initialize page 2
        FXMLLoader page2FxmlLoader = new FXMLLoader(ScenesApplication.class.getResource("page2-view.fxml"));
        this.page2 = new Scene(page2FxmlLoader.load(), 480, 200);
        ScenesController page2Controller = page2FxmlLoader.getController();
        page2Controller.setApplication(this);

        // initialize page 3
        FXMLLoader page3FxmlLoader = new FXMLLoader(ScenesApplication.class.getResource("page3-view.fxml"));
        this.page3 = new CustomPage(page3FxmlLoader.load(),480, 200);
        ScenesController page3Controller = page3FxmlLoader.getController();
        page3Controller.setApplication(this);

        // show the first scene
        stage.setTitle("Scene Switcher");
        stage.setScene(initialScene);
        stage.show();
    }

    private void switchPage(int page) {
        switch (page) {
            case 1:
                this.mainStage.setTitle("Page 1");
                this.mainStage.setScene(this.page1);
                break;
            case 2:
                this.mainStage.setTitle("Page 2");
                this.mainStage.setScene(this.page2);
                break;
            default:
                this.mainStage.setTitle("Page 3");
                this.mainStage.setScene(this.page3);
        }
    }

    public void initialPage() {
        this.switchPage(1);
    }

    public void next() {
        if (page < MAX_PAGE) {
            ++page;
        }

        this.switchPage(page);
    }

    public void previous() {
        if (page > 0) {
            --page;
        }

        this.switchPage(page);
    }
}
