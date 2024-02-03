package com.adityan150.springdto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adityan150.springdto.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
