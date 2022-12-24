package com.springproject.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.springproject.app.entity.Car;
import com.springproject.app.entity.User;

public interface CarRepository extends JpaRepository<Car, Long>{

	
	
}
