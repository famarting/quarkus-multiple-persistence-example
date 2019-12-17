package org.acme;

import org.bson.types.ObjectId;

import io.quarkus.mongodb.panache.MongoEntity;

@MongoEntity
public class MongoBook extends Book{

    public ObjectId id;

    public MongoBook() {
        super();
        // TODO Auto-generated constructor stub
    }

    public MongoBook(String uuid, String name, String from) {
        super(uuid, name, from);
        // TODO Auto-generated constructor stub
    }

}
