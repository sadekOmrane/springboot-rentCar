package com.springproject.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springproject.app.entity.Booking;
import com.springproject.app.entity.Car;
import com.springproject.app.repository.CarRepository;
import com.springproject.app.services.BookingService;
import com.springproject.app.services.CarService;

@Controller
public class HomeController {
	
	@Autowired 
	CarService carService;
	
	@Autowired
	BookingService bookingService;
	
	@GetMapping(value={"/home", "/"})
	public String index(Model model) {
		List<Car> offers = carService.findByPromoted();
		model.addAttribute("offers", offers);
		return "index";
	}
	
	@GetMapping("/fleet")
	public String fleet(Model model) {
		List<Car> cars = carService.findall();
		
		model.addAttribute("cars", cars);
		return "fleet";
	}
	
	@GetMapping("/booking")
	public String booking(Model model) {
		List<Booking> bookings = bookingService.findall();
		
		model.addAttribute("bookings", bookings);
		return "booking";
	}
	
	@GetMapping("/about")
	public String about(Model model) {
		return "about";
	}
	@GetMapping("/contact")
	public String contact(Model model) {
		return "contact";
	}
}
