package kamil.springframework.spring6webapp.services;

import kamil.springframework.spring6webapp.domain.Book;

public interface BookService {

    Iterable<Book> findAll();

}
