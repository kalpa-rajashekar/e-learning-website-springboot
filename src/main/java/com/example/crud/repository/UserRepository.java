package com.example.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.crud.entity.User;


public interface UserRepository extends JpaRepository<User, Long> {
	public User findByEmail(String email);
	
}
