package org.acme;

import java.util.List;

/**
 * BookRepository
 */
public interface BookRepository {

    Book save(Book book);

    List<Book> listAll();

}