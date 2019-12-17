package org.acme;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class MongoBookRepository implements BookRepository{

    @Inject
    QuarkusMongoBookRepository repo;

    @Override
    public Book save(Book book) {
        book.setFrom("mongo");
        MongoBook b = new MongoBook(book.getUuid(), book.getName(), book.getFrom());
        repo.persist(b);
        return b;
    }

    @Override
    public List<Book> listAll() {
        return new ArrayList<>(repo.listAll());
    }

}
