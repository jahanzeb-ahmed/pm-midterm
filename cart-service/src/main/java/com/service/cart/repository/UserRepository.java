package com.service.cart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.service.cart.domain.User;

public interface UserRepository extends JpaRepository<User,Integer> {
	
	@Query(value="SELECT u FROM User u WHERE u.username = ?1", nativeQuery=true)
    public User findByUsername(String username);
	
}
