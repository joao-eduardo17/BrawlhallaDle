package com.project.brawlhalladle.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.brawlhalladle.model.User;

public interface UserRepository extends JpaRepository<User, UUID> {
    boolean existsByUsername(String username);
    
}
