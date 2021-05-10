package com.service.cart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.service.cart.domain.Cart;
import com.service.cart.repository.CartRepository;

@Service
public class CartService  {
	
	@Autowired
	public CartRepository cartRepository;
	
	public Cart getCart(int cartId) {
		return cartRepository.findById(cartId).orElse(null);
	}
	
	public Cart saveCart(Cart cart) {
		return cartRepository.save(cart);
	}
	
	public int deleteCart(int cartId) {
		cartRepository.deleteById(cartId);
		return cartId;
	}
	
	public Cart updateCart(Cart cart) {
		Cart newCart = cartRepository.findById(cart.getCartId()).orElse(null);
		if(newCart!=null) {
			newCart.setAddress(cart.getAddress());
			newCart.setCard(cart.getCard());
			newCart.setProducts(cart.getProducts());
			return cartRepository.save(newCart);
		}
		return null;
	}
	
}