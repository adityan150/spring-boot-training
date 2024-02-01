package com.adityan150.springcrud.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adityan150.springcrud.model.Tutorial;

public interface TutorialRepository extends JpaRepository<Tutorial, Long> {
	// Implementation of the methods are automatically done by Spring Data JPA	
	List<Tutorial> findByPublished(boolean published);

	List<Tutorial> findByTitleContaining(String title);
}
