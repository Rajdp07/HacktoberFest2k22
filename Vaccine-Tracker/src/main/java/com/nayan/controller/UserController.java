package com.nayan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nayan.model.User;
import com.nayan.service.UserRegistrationService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value = "/user")

public class UserController {

	@Autowired
	private UserRegistrationService service;
	

	
	@GetMapping("/")
	public List<User> getAll(){
		return service.getAll();
	}
	@GetMapping("/{name}")
	public User findByName(@PathVariable String name) {
		return service.findByName(name);
	}
	
	@PostMapping("/register")
	public String saveUser(@RequestBody User user) {
	
		return service.saveUserData(user);
	}

	@DeleteMapping("/delete/{id}")
	public String deleteUser(@PathVariable long id) {
		return service.deleteDataById(id);
	}

}
