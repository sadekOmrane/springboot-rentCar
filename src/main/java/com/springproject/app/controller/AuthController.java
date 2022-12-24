package com.springproject.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.springproject.app.entity.User;
import com.springproject.app.repository.UserRepository;
import com.springproject.app.services.UserService;

@Controller
public class AuthController {
	
	@Autowired
	private UserService service;

	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@GetMapping("/logout")
	public String logout() {
		return "login";
	}
	
	@GetMapping("/register")
	public String register() {
		
		return "register";
	}
}
