package com.springproject.app.entity;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;


@Entity
@Table(name="booking")
public class Booking {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	@Column(nullable=false, length = 64)
	private String pick_location;
	@Column(nullable=false, length = 64)
	private String return_location;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date pick_date;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date return_date;
	public Date getReturn_date() {
		return return_date;
	}
	public void setReturn_date(Date return_date) {
		this.return_date = return_date;
	}
	@Column(nullable=false, length = 64)
	private String email;
	@Column(nullable=false, length = 64)
	private int phone;
	@Column(nullable=false, length = 64)
	private String car_name;
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getCar_name() {
		return car_name;
	}
	public void setCar_name(String car_name) {
		this.car_name = car_name;
	}
	public Booking() {
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPick_location() {
		return pick_location;
	}
	public Date getPick_date() {
		return pick_date;
	}
	public void setPick_date(Date pick_date) {
		this.pick_date = pick_date;
	}
	public void setPick_location(String pick_location) {
		this.pick_location = pick_location;
	}
	public String getReturn_location() {
		return return_location;
	}
	public void setReturn_location(String return_location) {
		this.return_location = return_location;
	}
	
}
