package com.example.Real.Estate.Service_Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import com.example.Real.Estate.Entities.Reg_User;
import com.example.Real.Estate.Repo.Reg_user_Repo;
import com.example.Real.Estate.Service.Reg_User_Service;

@Configuration
public class Reg_user_Service_Impl implements Reg_User_Service {
     
	@Autowired
	Reg_user_Repo reg_repo;
	
	@Override
	public Reg_User insert(Reg_User user) {
		// TODO Auto-generated method stub
		return reg_repo.save(user);
	}

	@Override
	public List<Reg_User> getAll() {
		// TODO Auto-generated method stub
		return reg_repo.findAll();
	}
	

}
