package com.springproject.app.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.springproject.app.entity.User;



public interface UserRepository extends JpaRepository<User, Long>{
	User findByUsername(String username);
}
