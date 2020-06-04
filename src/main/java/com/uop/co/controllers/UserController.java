package com.uop.co.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.uop.co.models.User;
import com.uop.co.services.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService service;
	
	// retrieve all users
	@GetMapping("/get")
	public List<User> getUsers() throws Exception{
		return service.getUsers();
	}
	
	// retrieve users by nic
	@GetMapping("/getByNIC")
	public User userByNIC(@RequestParam("nic") String nic) throws Exception{
		return service.userByNIC(nic);
	}
	
	// create a user
	@PostMapping("/create")
	public User createUser(@RequestBody User user) throws Exception{
		return service.createUser(user);
	}
	
	// update a user
	@PutMapping("/update")
	public User updateUser(@RequestBody User user) throws Exception{
		return service.updateUser(user);
	}
	
	// delete a user
	@DeleteMapping("/delete")
	public boolean deleteUser(@RequestParam("id") String id) throws Exception{
		return service.deleteUser(id);
	}

}
