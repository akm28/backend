package com.example.Real.Estate.Entities;


import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
public class Reg_User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int reguser_id;
	
	@Column(length = 20, nullable = false)
	private String first_name;
	
	@Column(length = 20, nullable = false)
	private String last_name;
	
	@Column( length = 11)
	private String phone;
	
	private int role_id;
	
	private LocalDate date;
	
	@Column(unique = true)
	private String  email;
	
	private String password;
	private int interest_id;
	private int favorite_id;
	private LocalTime time;
	
	public Reg_User(int reguser_id, String first_name, String last_name, String phone, int role_id, LocalDate date,
			String email, String password, int interest_id, int favorite_id, LocalTime time) {
		super();
		this.reguser_id = reguser_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.phone = phone;
		this.role_id = role_id;
		this.date = date;
		this.email = email;
		this.password = password;
		this.interest_id = interest_id;
		this.favorite_id = favorite_id;
		this.time = time;
	}
	public int getReguser_id() {
		return reguser_id;
	}
	public void setReguser_id(int reguser_id) {
		this.reguser_id = reguser_id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getRole_id() {
		return role_id;
	}
	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getInterest_id() {
		return interest_id;
	}
	public void setInterest_id(int interest_id) {
		this.interest_id = interest_id;
	}
	public int getFavorite_id() {
		return favorite_id;
	}
	public void setFavorite_id(int favorite_id) {
		this.favorite_id = favorite_id;
	}
	public LocalTime getTime() {
		return time;
	}
	public void setTime(LocalTime time) {
		this.time = time;
	}
	
	public Reg_User() {
		
	}
	
	

	
	

	
	

}
