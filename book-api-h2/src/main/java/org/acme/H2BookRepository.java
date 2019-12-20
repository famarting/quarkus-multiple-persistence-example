package org.acme;

import java.util.List;
import java.util.stream.Collectors;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;

@ApplicationScoped
public class H2BookRepository implements BookRepository{

    @Inject
    QuarkusH2BookRepository repo;

    @Inject
    H2BookMapper mapper;

    @Override
    @Transactional
    public Book save(Book book) {
        book.setFrom("h2");
        H2Book b = mapper.to(book);
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
