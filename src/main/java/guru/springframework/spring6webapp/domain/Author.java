package guru.springframework.spring6webapp.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.Set;


// Indicates Entity To Database
// Indicates that this class is mapped to a database table
@Entity
public class Author {

    //ID JPA
    //AUTO GENERATED

    // JPA annotation for specifying the primary key
    @Id
    // Specifies that the primary key value will be generated automatically
    @GeneratedValue(strategy = GenerationType.AUTO)


    private Long id;
    private String firstName;
    private String lastName;


    // Specifies a many-to-many relationship with the Book entity
   @ManyToMany(mappedBy = "authors")

    // Ensures that there are no duplicate books in the Set
    private Set<Book> books;


    //ID Getters and setters
    // Getter and setter methods for the id field
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    //First Name Getters and setters
    // Getter and setter methods for the firstName field
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }



    //Last Name Getters and setters
    // Getter and setter methods for the lastName field
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // toString() method to represent the Author object as a String
    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", books=" + books +
                '}';
    }

    // equals() method to compare two Author objects for equality
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Author author)) return false;

        return getId() != null ? getId().equals(author.getId()) : author.getId() == null;
    }

    // hashCode() method to generate a hash code for the Author object
    @Override
    public int hashCode() {
        return getId() != null ? getId().hashCode() : 0;
    }
}
