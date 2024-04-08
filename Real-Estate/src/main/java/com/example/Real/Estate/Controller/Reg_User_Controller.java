package com.example.Real.Estate.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Real.Estate.Entities.Reg_User;
import com.example.Real.Estate.Service.Reg_User_Service;

@RestController
@RequestMapping("/user")
public class Reg_User_Controller {
	
	@Autowired
	Reg_User_Service regService;
	
	@GetMapping("/all")
	public ResponseEntity<List<Reg_User>> getAll(){
	return new ResponseEntity<List<Reg_User>>(regService.getAll(),HttpStatus.OK);
	}
	
	@PostMapping("/save")
	public ResponseEntity<Reg_User> save(@RequestBody Reg_User user) {
		return new ResponseEntity<Reg_User>(regService.insert(user), HttpStatus.OK);
	}
}

