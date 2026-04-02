package com.project.brawlhalladle.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.brawlhalladle.model.UserDTO;
import com.project.brawlhalladle.service.UserService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @PostMapping("/signup")
    public ResponseEntity<Void> create(@RequestBody @Valid UserDTO dto) {
        service.createUser(dto);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
