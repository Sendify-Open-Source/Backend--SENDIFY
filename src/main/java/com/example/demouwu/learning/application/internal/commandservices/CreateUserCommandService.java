package com.example.demouwu.learning.application.internal.commandservices;

import com.example.demouwu.learning.domain.model.aggregates.User;
import com.example.demouwu.learning.domain.model.valueobjects.EmailAddress;
import com.example.demouwu.learning.infraestructure.persistence.jpa.repositories.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class CreateUserCommandService {
    private final UserRepository userRepository;

    public CreateUserCommandService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User handle(String fullName, String email, String role) {
        User user = new User(fullName, new EmailAddress(email), role);
        return userRepository.save(user);
    }
}
