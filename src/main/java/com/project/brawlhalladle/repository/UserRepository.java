package com.project.brawlhalladle.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.brawlhalladle.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
}
