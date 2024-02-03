package com.adityan150.springdto.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.adityan150.springdto.dto.UserLocationDTO;
import com.adityan150.springdto.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

	@Query(value = "SELECT u.id as userId, u.email as email, l.place as place, l.latitude as latitude, l.longitude as longitude FROM User u LEFT JOIN Location l ON u.location.id = l.id WHERE l.place = :place")
	public List<UserLocationDTO> getUsersWithLocation(@Param("place") String place);
}
