package com.example.demouwu.learning.infraestructure.persistence.jpa.repositories;

import org.springframework.stereotype.Repository;
import com.example.demouwu.learning.domain.model.aggregates.User;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {}