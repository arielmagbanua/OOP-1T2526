package oop.mmcm.tasksapp.controllers;

import oop.mmcm.tasksapp.TasksApplication;

public abstract class BaseController {
    protected TasksApplication application;

    public TasksApplication getApplication() {
        return application;
    }

    public void setApplication(TasksApplication application) {
        this.application = application;
    }
}
