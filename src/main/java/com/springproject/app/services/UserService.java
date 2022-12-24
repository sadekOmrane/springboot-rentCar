package com.springproject.app.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.springproject.app.entity.User;
import com.springproject.app.entity.UserPrincipal;
import com.springproject.app.repository.UserRepository;

@Service 
public class UserService implements UserDetailsService {

	@Autowired
	private BCryptPasswordEncoder encoder;
	
	@Autowired UserRepository userRepository;
	
	public void save(User user) {
		user.setPassword(encoder.encode(user.getPassword()));
		userRepository.save(user);
	}
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userRepository.findByUsername(username);
		
		if(user == null) {
			throw new UsernameNotFoundException("user not found");
		}
		return new UserPrincipal(user);
	}
}
