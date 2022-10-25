package CRUD.example.crude_backend.Entity;

import javax.persistence.*;

@Entity
@Table(name = "users")

public class User {
    // attributes
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String email;

    //constructor without parameters
    public User(){

    }
    //parameter constructor
    public User(String username, String email) {
        this.username = username;
        this.email = email;
    }

    //getters & setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
