package com.example.Real.Estate.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Real.Estate.Entities.Reg_User;

@Service
public interface Reg_User_Service {
	
	public Reg_User insert(Reg_User user);
	public List<Reg_User> getAll();

}
