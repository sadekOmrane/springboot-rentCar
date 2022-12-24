package com.springproject.app.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import com.springproject.app.entity.Booking;
import com.springproject.app.entity.User;
import com.springproject.app.services.BookingService;
import com.springproject.app.services.CarService;
import com.springproject.app.services.UserService;

@Controller
public class BookingController {
	@Autowired
	private BookingService bookingService;
	@Autowired
	private CarService carService;
	
	@PostMapping(value="/booking/add")
	public RedirectView  add(Booking booking) {
		bookingService.save(booking);
		RedirectView  redirectView= new RedirectView("/booking",true);
	    return redirectView;			
	}
	@RequestMapping("booking/update/{id}")
	public ModelAndView showEditEtudiantPage(@PathVariable(name="id") Long id)
	{
		ModelAndView mav=new ModelAndView("form");
		Booking booking=bookingService.get(id);
		mav.addObject("booking",booking);
		return mav;
	}
	
	@RequestMapping("/booking/delete/{id}")
	public String deleteetudiant(@PathVariable(name="id")Long id)
	{
		bookingService.delete(id);
		return "redirect:/booking";
	}
}
