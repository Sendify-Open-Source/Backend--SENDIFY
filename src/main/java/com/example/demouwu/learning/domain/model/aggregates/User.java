package com.example.demouwu.learning.domain.model.aggregates;
import com.example.demouwu.learning.domain.model.valueobjects.EmailAddress;
import jakarta.persistence.*;
import lombok.Getter;

@Getter
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fullName;

    @Embedded
    private EmailAddress email;

    private String role;

    public User() {}

    public User(String fullName, EmailAddress email, String role) {
        this.fullName = fullName;
        this.email = email;
        this.role = role;
    }

    // Getters

}
