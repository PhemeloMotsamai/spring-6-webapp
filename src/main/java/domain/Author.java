package domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Set;


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
}