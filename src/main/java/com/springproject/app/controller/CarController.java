package com.springproject.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import com.springproject.app.entity.Car;
import com.springproject.app.entity.User;
import com.springproject.app.services.CarService;
import com.springproject.app.services.UserService;


@Controller
public class CarController {
	
	@Autowired
	private CarService carService;
	
}
