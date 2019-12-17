package org.acme;

import java.util.List;
import java.util.UUID;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

/**
 * BookService
 */
@ApplicationScoped
public class BookService {

    @Inject
    BookRepository repo;

    public Book createBook(Book book){
        book.setUuid(UUID.randomUUID().toString());
        return repo.save(book);
    }

    public List<Book> listAll() {
        return repo.listAll();
    }

}