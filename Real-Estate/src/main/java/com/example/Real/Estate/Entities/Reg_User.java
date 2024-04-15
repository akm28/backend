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
	
	
	
	

	
	

	
	

}
