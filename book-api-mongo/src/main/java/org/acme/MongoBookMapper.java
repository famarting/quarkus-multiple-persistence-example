package org.acme;

import org.mapstruct.Mapper;

@Mapper(config = QuarkusMapperConfig.class)
public interface MongoBookMapper {

    Book to(MongoBook b);

    MongoBook to(Book b);

}
