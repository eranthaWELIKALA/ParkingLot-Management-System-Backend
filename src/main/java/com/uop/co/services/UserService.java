package com.uop.co.services;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uop.co.models.User;
import com.uop.co.repositories.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository repo;
	
	// retrieve all users
	public List<User> getUsers() throws Exception{
		return repo.findAll();
	}
	
	// retrieve users by id
	public User userByNIC(String nic) throws Exception{
		Optional<User> userResponse = repo.findById(nic);
		User  user;
		try {
			user = userResponse.get();
		}
		catch(NoSuchElementException ex) {
			user = null;
		}		
		return user;
	}
	
	// create a user if no existing user with the corresponding nic and retrieve the create user
	public User createUser(User user) throws Exception{
		String nic = user.getNic();
		Optional<User> existingUserResponse = repo.findById(nic);
		User existingUser;
		try {
			existingUser = existingUserResponse.get();
		}
		catch(NoSuchElementException ex) {
			existingUser = null;
		}
		if(existingUser==null) {
			user.setType(user.getType());
			user = repo.save(user);
		}		
		return user;
	}
	
	// update a user
	public User updateUser(User user) throws Exception{		
		String nic = user.getNic();
		String firstname = user.getFirstname();
		String lastname = user.getFirstname();
		String email = user.getEmail();
		String contactNo = user.getContactNo();
		
		if(nic!=null) {
			Optional<User> userFromDBResponse = repo.findById(nic);
			User userFromDB = userFromDBResponse.get();
			
			// Set Details
			userFromDB.setNic(nic);
			userFromDB.setFirstname(firstname);
			userFromDB.setLastname(lastname);
			userFromDB.setEmail(email);
			userFromDB.setContactNo(contactNo);
			
			user = repo.save(userFromDB);
		}
		else {
			user = null;
		}
		return user;
	}
	
	// delete a user
	public boolean deleteUser(String id){
		boolean result = false;
		try {
			repo.deleteById(id);
			result = true;
		}
		catch(Exception ex) {
			result = false;
		}
		return result;
	}
}
