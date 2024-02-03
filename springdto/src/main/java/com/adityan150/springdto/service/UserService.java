package com.adityan150.springdto.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.adityan150.springdto.dto.UserLocationDTO;
import com.adityan150.springdto.model.User;
import com.adityan150.springdto.repository.UserRepository;

@Service
public class UserService {

	private UserRepository userRepository;

	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public List<UserLocationDTO> getAllUsersLocation() {
		return userRepository.findAll().stream().map(this::convertEntityToDto).toList();
	}

	private UserLocationDTO convertEntityToDto(User user) {
		UserLocationDTO userLocationDTO = new UserLocationDTO();
		userLocationDTO.setUserId(user.getId());
		userLocationDTO.setEmail(user.getEmail());
		userLocationDTO.setPlace(user.getLocation().getPlace());
		userLocationDTO.setLongitude(user.getLocation().getLongitude());
		userLocationDTO.setLatitude(user.getLocation().getLatitude());

		return userLocationDTO;
	}
}