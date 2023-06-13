package domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.Set;

import org.hibernate.annotations.ManyToAny;


// Indicates Entity To Database
@Entity
public class Author {

    //ID JPA
    //AUTO GENERATED
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)


    private Long id;
    private String firstName;
    private String lastName;

   @ManyToMany(mappedBy = "authors")
    // no duplicates 
    private Set<Book> books;


    //ID Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    //First Name Getters and setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }



    //Last Name Getters and setters

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Author author)) return false;

        return getId() != null ? getId().equals(author.getId()) : author.getId() == null;
    }

    @Override
    public int hashCode() {
        return getId() != null ? getId().hashCode() : 0;
    }
}
