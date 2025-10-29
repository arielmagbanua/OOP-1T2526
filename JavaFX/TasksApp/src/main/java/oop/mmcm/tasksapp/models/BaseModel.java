package oop.mmcm.tasksapp.models;

import org.bson.Document;
import org.bson.types.ObjectId;

public abstract class BaseModel {
    // mongodb document id
    protected ObjectId id;

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public abstract Document toDocument();
}
