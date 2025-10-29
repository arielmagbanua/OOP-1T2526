package oop.mmcm.tasksapp.models;

import oop.mmcm.tasksapp.controllers.BaseController;
import org.bson.Document;

public class User extends BaseModel {
    private String fistName;
    private String lastName;
    private String email;
    private String password;

    public User() {}

    public String getFistName() {
        return fistName;
    }

    public void setFistName(String fistName) {
        this.fistName = fistName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public Document toDocument() {
        Document doc = new Document();
        doc.append("fistName", this.fistName);
        doc.append("lastName", this.lastName);
        doc.append("email", this.email);
        doc.append("password", this.password);

        return doc;
    }
}
