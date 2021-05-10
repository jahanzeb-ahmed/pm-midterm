package com.service.cart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.service.cart.domain.Cart;

@Repository
public interface CartRepository extends JpaRepository<Cart,Integer> {
	
	
}
