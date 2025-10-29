package oop.mmcm.tasksapp.repositories;

import oop.mmcm.tasksapp.models.User;
import org.bson.Document;

import static com.mongodb.client.model.Filters.eq;

public class UserRepository extends BaseRepository<User> {
    @Override
    protected User convert(Document document) {
        User user = new User();
        user.setId(document.getObjectId("_id"));
        user.setFistName(document.getString("fistName"));
        user.setLastName(document.getString("lastName"));
        user.setEmail(document.getString("email"));
        user.setPassword(document.getString("password"));

        return user;
    }

    public User findByEmail(String email) {
        Document document = this.collection.find(eq("email", email)).first();
        if (document == null) {
            return null;
        }

        return this.convert(document);
    }

    @Override
    protected String collectionName() {
        return "users";
    }
}
