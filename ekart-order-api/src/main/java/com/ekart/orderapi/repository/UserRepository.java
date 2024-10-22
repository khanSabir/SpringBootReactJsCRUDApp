package com.ekart.orderapi.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ekart.orderapi.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
	Optional<User> findByUsername (String name);
	
	boolean existsByUsername(String username);
	
    boolean existsByEmail(String email);

}