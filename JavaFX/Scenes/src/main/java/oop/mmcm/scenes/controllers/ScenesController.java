package oop.mmcm.scenes.controllers;

import javafx.fxml.FXML;
import oop.mmcm.scenes.ScenesApplication;

public class ScenesController {
    protected ScenesApplication app;

    public void setApplication(ScenesApplication app) {
        this.app = app;
    }

    @FXML
    protected void initialPage() {
        this.app.initialPage();
    }

    @FXML
    protected void next() {
        this.app.next();
    }

    @FXML
    protected void previous() {
        this.app.previous();
    }
}
