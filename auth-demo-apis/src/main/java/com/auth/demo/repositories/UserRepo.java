package com.auth.demo.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.auth.demo.entities.User;

public interface UserRepo extends JpaRepository<User, Integer>{
		
	
	Optional<User> findByEmail(String email);
}