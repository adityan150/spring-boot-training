package com.adityan150.springdto.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.adityan150.springdto.dto.UserLocationDTO;
import com.adityan150.springdto.service.UserService;

@RestController
public class UserController {

	private UserService userService;

	public UserController(UserService userService) {
		this.userService = userService;
	}

	@GetMapping("/users-location")
	public List<UserLocationDTO> getAllUsersLocatoin() {
		return userService.getAllUsersLocation();
	}

	@GetMapping("/users-location/{place}")
	public List<UserLocationDTO> getUsersWithLocation(@RequestParam String place) {
		return userService.getUsersWithLocation(place);
	}

}
