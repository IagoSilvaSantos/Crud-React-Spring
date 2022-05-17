package com.website.webmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.website.webmovie.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

   User findByEmail(String email);
	
	
}
