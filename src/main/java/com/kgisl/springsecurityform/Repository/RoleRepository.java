package com.kgisl.springsecurityform.Repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

import com.kgisl.springsecurityform.Entity.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {
    Optional<Role> findByName(String name);
}