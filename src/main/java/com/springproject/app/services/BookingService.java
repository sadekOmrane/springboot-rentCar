package com.springproject.app.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springproject.app.entity.Booking;
import com.springproject.app.repository.BookingRepository;

@Service
public class BookingService {
@Autowired BookingRepository bookingRepository;
	
	public void save(Booking booking) {
		bookingRepository.save(booking);
	}

	public List<Booking> findall() {
		return bookingRepository.findAll();
	}

	
	public void deleteById(Long id) {
		bookingRepository.deleteById(id);
    }
	
	public Booking get(Long id)
	{
		return bookingRepository.findById(id).get();

	}
	public void delete(Long id)
	{
		bookingRepository.deleteById(id);
	}
}
