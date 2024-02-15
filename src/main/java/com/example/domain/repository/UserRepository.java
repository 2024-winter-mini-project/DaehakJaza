package com.example.domain.repository;

import com.example.DTO.UserDTO;
import com.example.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    UserDTO findByUserId(String id);
}
