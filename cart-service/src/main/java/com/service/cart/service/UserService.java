package com.service.cart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.service.cart.repository.UserRepository;

import java.util.ArrayList;

@Service
public class UserService implements UserDetailsService {

	@Autowired
	private UserRepository userRpository;
	
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
    	
    	//com.service.cart.domain.User user = userRpository.findByUsername(s);
    	
    	//System.out.println( user.getUsername() +" : "+ user.getPassword() );
    	
        return new User("jahmed", "jas@123",
                new ArrayList<>()); //list of authorities
    }
    
}