package kamil.springframework.spring6webapp.services;


import kamil.springframework.spring6webapp.domain.Author;

public interface AuthorService {
    Iterable<Author> findAll();
}
