package com.adityan150.springdto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adityan150.springdto.model.Location;

public interface LocationRepository extends JpaRepository<Location, Long> {
}
