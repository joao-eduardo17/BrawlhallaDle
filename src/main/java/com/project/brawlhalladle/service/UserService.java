package com.project.brawlhalladle.service;

import java.util.Date;

import org.springframework.stereotype.Service;

import com.project.brawlhalladle.exception.UsernameAlreadyExistsException;
import com.project.brawlhalladle.model.User;
import com.project.brawlhalladle.model.UserDTO;
import com.project.brawlhalladle.repository.UserRepository;

@Service
public class UserService {
    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public User createUser(UserDTO user) {
        if (repository.existsByUsername(user.getUsername())) {
            throw new UsernameAlreadyExistsException("Username already exists");
        }
        User newUser = User.builder()
                .username(user.getUsername())
                .password(user.getPassword())
                .createdAt(new Date())
                .updatedAt(new Date())
                .build();
        return repository.save(newUser);
    }

}
