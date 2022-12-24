package com.springproject.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springproject.app.entity.Car;
import com.springproject.app.repository.CarRepository;

@Service
public class CarService {
	
	@Autowired
	CarRepository carRepository;
	
	public void save(Car car) {
		carRepository.save(car);
	}
	
	public List<Car> findall(){
		List<Car> cars = carRepository.findAll();
		return cars;
	}

	public List<Car> findByPromoted() {
		List<Car> cars = carRepository.findAll();
		for(int i = 0; i < cars.size(); i++) {
			if(cars.get(i).getIsPromoted()==false)
				cars.remove(i);
		}
		return cars;
	}

	public Car findById(int carId) {
		List<Car> cars = carRepository.findAll();
		for(int i = 0; i < cars.size(); i++) {
			if(cars.get(i).getId()!=carId)
				cars.remove(i);
		}
		if(cars.size()>0)
			return cars.get(0);
		return null;
	}

}
