package com.example.jwtspringexample.repository;


import com.example.jwtspringexample.models.Enums.ERole;
import com.example.jwtspringexample.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role,Integer> {
    Optional<Role> findByName(ERole name);
}
