package guru.springframework.spring6webapp.repositories;

import guru.springframework.spring6webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

// This interface AuthorRepository is a repository interface for the Author entity.
// It extends the CrudRepository interface, which provides basic CRUD operations for entities.
// The Author entity represents an author in the application.
// The type parameters <Author, Long> specify that the repository works with Author entities and uses Long as the type for the entity's ID.
// By extending CrudRepository, the AuthorRepository inherits methods such as save(), findById(), findAll(), delete(), etc., which can be used to perform CRUD operations on Author entities.
// This repository interface allows convenient interaction with the underlying database for managing Author entities.
public interface AuthorRepository extends CrudRepository <Author,Long> {
}
