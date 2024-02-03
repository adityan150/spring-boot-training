package com.adityan150.springdto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.adityan150.springdto.model.Location;
import com.adityan150.springdto.model.User;
import com.adityan150.springdto.repository.LocationRepository;
import com.adityan150.springdto.repository.UserRepository;

@SpringBootApplication
public class SpringdtoApplication implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private LocationRepository locationRepository;

	@Override
	public void run(String... args) throws Exception {
		Location location = new Location();
		location.setPlace("Bengaluru");
		location.setDescription("Bengaluru is the capital of Karnataka.");
		location.setLatitude(123.123);
		location.setLongitude(123.123);

		Location savedLocation = locationRepository.save(location);

		User user1 = new User();
		user1.setFirstName("King");
		user1.setLastName("Charles");
		user1.setEmail("kingcharles@gmail.com");
		user1.setPassword("kingcharles");
		user1.setLocation(savedLocation);

		userRepository.save(user1);

		User user2 = new User();
		user2.setFirstName("Prince");
		user2.setLastName("Lois");
		user2.setEmail("princelois@gmail.com");
		user2.setPassword("princelois");
		user2.setLocation(savedLocation);

		userRepository.save(user2);

	}

	public static void main(String[] args) {
		SpringApplication.run(SpringdtoApplication.class, args);
	}

}
