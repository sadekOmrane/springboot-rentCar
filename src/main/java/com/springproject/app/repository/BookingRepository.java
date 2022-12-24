package com.springproject.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springproject.app.entity.Booking;
import com.springproject.app.entity.User;

public interface BookingRepository extends JpaRepository<Booking, Long>{
	
}
