package com.service.cart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.cart.domain.Cart;
import com.service.cart.service.CartService;

@RestController
@RequestMapping("/cart")
public class CartController {

	@Autowired
	public CartService cartService;
	
	@GetMapping("/{cartId}")
	public Cart getCart(@PathVariable int cartId) {
		System.out.println(cartId);
		return cartService.getCart(cartId);
	}
	
	@PostMapping("/")
	public Cart createCart(@RequestBody Cart cart) {
		System.out.println(cart.toString());
		return cartService.saveCart(cart);
	}
	
	@DeleteMapping("/{cartId}")
	public int deleteCart(@PathVariable int cartId) {
		System.out.println(cartId);
		return cartService.deleteCart(cartId);
	}
	
	@PutMapping("/")
	public Cart updateCart(@RequestBody Cart cart) {
		System.out.println(cart.toString());
		return cartService.saveCart(cart);
	}
	
	//checkout service
	
	/*
	@PostMapping("/{cartId}/product")
	public Cart addProduct(@PathVariable int cartId, @RequestBody Product product) {
		System.out.println(product.toString());
		Cart cart = cartService.getCart(cartId);
		Set<Product> products = cart.getProducts();
		products.add(product);
		cart.setProducts(products);
		return cartService.saveCart(cart);
	}
	
	@DeleteMapping("/{cartId}/product")
	public Cart removeProduct(@PathVariable int cartId, @RequestBody Product product) {
		System.out.println(product.toString());
		Cart cart = cartService.getCart(cartId);
		Set<Product> products = cart.getProducts();
		products.remove(product);
		cart.setProducts(products);
		return cartService.saveCart(cart);
	}
	
	
	@PostMapping("/{cartId}/address")
	public Cart addAddress(@PathVariable int cartId, @RequestBody Address address) {
		System.out.println(address.toString());
		Cart cart = cartService.getCart(cartId);
		cart.setAddress(address);
		return cartService.saveCart(cart);
	}
	
	@DeleteMapping("/{cartId}/address")
	public Cart removeAddress(@PathVariable int cartId, @RequestBody Address address) {
		System.out.println(address.toString());
		Cart cart = cartService.getCart(cartId);
		cart.setAddress(null);
		return cartService.saveCart(cart);
	}
	
	
	@PostMapping("/{cartId}/card")
	public Cart addCard(@PathVariable int cartId, @RequestBody Card card) {
		System.out.println(card.toString());
		Cart cart = cartService.getCart(cartId);
		cart.setCard(card);
		return cartService.saveCart(cart);
	}
	
	@DeleteMapping("/{cartId}/card")
	public Cart removeCard(@PathVariable int cartId, @RequestBody Card card) {
		System.out.println(card.toString());
		Cart cart = cartService.getCart(cartId);
		cart.setCard(null);
		return cartService.saveCart(cart);
	}
	*/
}