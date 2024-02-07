package com.kgisl.springsecurityform.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kgisl.springsecurityform.Entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUsernameOrEmail(String username, String email);

    boolean existsByUsername(String username);

    boolean existsByEmail(String email);
}