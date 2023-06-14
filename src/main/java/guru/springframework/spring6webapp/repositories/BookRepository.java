package guru.springframework.spring6webapp.repositories;

import guru.springframework.spring6webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;


// This interface BookRepository serves as a repository for the Book entity.
// It extends the CrudRepository interface provided by Spring Data JPA.
// The Book entity represents a book in the application.
// The type parameters <Book, Long> specify that the repository works with Book entities and uses Long as the type for the entity's ID.
// By extending CrudRepository, the BookRepository inherits methods such as save(), findById(), findAll(), delete(), etc., which can be used to perform CRUD operations on Book entities.
// This repository interface allows convenient interaction with the underlying database for managing Book entities.
public interface BookRepository extends CrudRepository <Book,Long>{
}
