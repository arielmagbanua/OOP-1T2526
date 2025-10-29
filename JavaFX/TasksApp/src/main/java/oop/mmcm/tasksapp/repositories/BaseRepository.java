package oop.mmcm.tasksapp.repositories;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import oop.mmcm.tasksapp.models.BaseModel;
import oop.mmcm.tasksapp.utils.DatabaseHelper;
import org.bson.Document;
import org.bson.types.ObjectId;

import static com.mongodb.client.model.Filters.eq;

public abstract class BaseRepository<T extends BaseModel> {
    protected final MongoCollection<Document> collection;

    public BaseRepository() {
        // get mongodb database instance
        MongoDatabase database = DatabaseHelper.getInstance().getDatabase();
        // get users collection
        this.collection = database.getCollection(this.collectionName());
    }

    public void insert(T entity) {
        Document document = entity.toDocument();
        this.collection.insertOne(document);

        // set the generated id back to the entity
        entity.setId(document.getObjectId("_id"));
    }

    public T findById(ObjectId id) {
        // find the document by id
        Document doc = collection.find(eq("_id", id)).first();

        if (doc == null) {
            return null;
        }

        return this.convert(doc);
    }

    public void update(ObjectId id, T newEntity) {
        Document newDoc = newEntity.toDocument();
        this.collection.replaceOne(eq("_id", id), newDoc);
    }

    public boolean delete(ObjectId id) {
        return this.collection.deleteOne(eq("_id", id)).getDeletedCount() > 0;
    }

    protected abstract T convert(Document document);

    protected abstract String collectionName();
}
