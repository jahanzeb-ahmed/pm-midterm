package com.service.cart.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cart")
public class Cart {
	
	@Id
	private int cartId;
	
	private double bill;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Address address;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Card card;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="cart_product",
			joinColumns = {@JoinColumn(name="cartId")},
			inverseJoinColumns = {@JoinColumn(name="productNumber")}
	)
	private Set<Product> products = new HashSet<>();
	
}
