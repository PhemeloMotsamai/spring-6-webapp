package guru.springframework.spring6webapp.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

import java.util.Set;

@Entity
public class Book {

    // ID JPA
    // AUTO GENERATED

    // JPA annotation for specifying the primary key
    @Id
    // Specifies that the primary key value will be generated automatically
    @GeneratedValue(strategy = GenerationType.AUTO)

    // JPA Entities
    private Long id;
    private String title;
    private String isbn;


    // Specifies a many-to-many relationship with the Author entity
    @ManyToMany

    // Specifies the join table name and the foreign key columns
    @JoinTable(name = "author_book",
            joinColumns = @JoinColumn(name = "book_id"),
            inverseJoinColumns = @JoinColumn(name = "author_id"))

    private Set<Author> authors;

    // ID Getters and setters
    // Getter and setter methods for the id field
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // Title Getters and setters
    // Getter and setter methods for the title field
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    // ISBN Getters and setters
    // Getter and setter methods for the isbn field
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    // toString() method to represent the Book object as a String
    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", isbn='" + isbn + '\'' +
                ", authors=" + authors +
                '}';
    }

    // equals() method to compare two Book objects for equality
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book book)) return false;

        return getId() != null ? getId().equals(book.getId()) : book.getId() == null;
    }

    // hashCode() method to generate a hash code for the Book object
    @Override
    public int hashCode() {
        return getId() != null ? getId().hashCode() : 0;
    }
}
