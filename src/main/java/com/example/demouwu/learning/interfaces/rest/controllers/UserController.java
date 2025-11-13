package com.example.demouwu.learning.interfaces.rest.controllers;

import com.example.demouwu.learning.application.internal.commandservices.CreateUserCommandService;
import com.example.demouwu.learning.application.internal.queryservices.GetUserQueryService;
import com.example.demouwu.learning.domain.model.aggregates.User;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
@CrossOrigin
public class UserController {
    private final CreateUserCommandService createUserCommandService;
    private final GetUserQueryService getUserQueryService;

    public UserController(CreateUserCommandService createUserCommandService,
                          GetUserQueryService getUserQueryService) {
        this.createUserCommandService = createUserCommandService;
        this.getUserQueryService = getUserQueryService;
    }

    @PostMapping
    public User createUser(@RequestBody User request) {
        return createUserCommandService.handle(request.getFullName(), request.getEmail().getAddress(), request.getRole());
    }

    @GetMapping
    public List<User> getAll() {
        return getUserQueryService.getAll();
    }

    @GetMapping("/{id}")
    public User getById(@PathVariable Long id) {
        return getUserQueryService.getById(id);
    }
}
