package oop.mmcm.registration.models;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

public class DatabaseHelper {
    protected final String dbUri = "DATABASE_URI_HERE";

    // ensure only one instance of DatabaseHelper exists (singleton pattern)
    private static final DatabaseHelper instance = new DatabaseHelper();

    private MongoDatabase database;

    private DatabaseHelper() {
        // prevent instantiation from outside
    }

    public static DatabaseHelper getInstance() {
        return instance;
    }

    public MongoDatabase getDatabase() {
        if (this.database == null) {
            // no database connection yet, create one
            try (MongoClient mongoClient = MongoClients.create(dbUri)) {
                this.database = mongoClient.getDatabase("movies");
            }
        }

        return this.database;
    }
}
