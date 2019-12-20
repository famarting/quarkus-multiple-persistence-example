package org.acme;

import org.mapstruct.Mapper;

@Mapper(config = QuarkusMapperConfig.class)
public interface H2BookMapper {

    Book to(H2Book b);

    H2Book to(Book b);

}
