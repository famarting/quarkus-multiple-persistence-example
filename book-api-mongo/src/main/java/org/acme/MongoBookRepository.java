package org.acme;

import java.util.List;
import java.util.stream.Collectors;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class MongoBookRepository implements BookRepository{

    @Inject
    QuarkusMongoBookRepository repo;

    @Inject
    MongoBookMapper mapper;

    @Override
    public Book save(Book book) {
        book.setFrom("mongo");
        MongoBook b = mapper.to(book);
        repo.persist(b);
        return book;
    }

    @Override
    public List<Book> listAll() {
        return repo.streamAll()
                .map(mapper::to)
                .collect(Collectors.toList());
    }

}
