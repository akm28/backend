package com.example.Real.Estate;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.Real.Estate.Entities.Reg_User;
import com.example.Real.Estate.Service.Reg_User_Service;

@SpringBootApplication
public class RealEstateApplication implements CommandLineRunner{
	
	@Autowired
	Reg_User_Service service;

	public static void main(String[] args) {
		SpringApplication.run(RealEstateApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Reg_User user1= new Reg_User();
		user1.setFirst_name("Aung Khant");
		user1.setLast_name("Min");
		user1.setEmail("akm@gmail.com");
		user1.setFavorite_id(1);
		user1.setDate(LocalDate.now());
		user1.setTime(LocalTime.now());
		user1.setInterest_id(1);
		user1.setPassword("12345678");
		user1.setPhone("09786921536");
		user1.setRole_id(1);
		
		Reg_User newuser=service.insert(user1);
		
		Reg_User user2= new Reg_User();
		user2.setFirst_name("akm");
		user2.setLast_name("akm");
		user2.setEmail("akm33@gmail.com");
		user2.setFavorite_id(2);
		user2.setDate(LocalDate.now());
		user2.setTime(LocalTime.now());
		user2.setInterest_id(2);
		user2.setPassword("12345678");
		user2.setPhone("09786921536");
		user2.setRole_id(2);
		
		Reg_User newuser2=service.insert(user2);
		
	}
 
	
}
