package org.acme;

import javax.enterprise.context.ApplicationScoped;

import io.quarkus.mongodb.panache.PanacheMongoRepository;

@ApplicationScoped
public class QuarkusMongoBookRepository implements PanacheMongoRepository<MongoBook>{

}
