package com.project.brawlhalladle.service;

import org.springframework.stereotype.Service;

import com.project.brawlhalladle.model.User;
import com.project.brawlhalladle.repository.UserRepository;

@Service
public class UserService {
    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public User save(User user) {
        return repository.save(user);
    }

}
