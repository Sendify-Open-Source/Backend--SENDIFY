package com.example.demouwu.learning.application.internal.queryservices;

import com.example.demouwu.learning.domain.model.aggregates.User;
import com.example.demouwu.learning.infraestructure.persistence.jpa.repositories.UserRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class GetUserQueryService {
    private final UserRepository userRepository;

    public GetUserQueryService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAll() { return userRepository.findAll(); }

    public User getById(Long id) { return userRepository.findById(id).orElse(null); }
}
