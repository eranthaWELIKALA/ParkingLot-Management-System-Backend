package com.uop.co.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uop.co.helpers.UserHelper;
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
	
	// retrieve users by nic
	public User userByNIC(String nic) throws Exception{
		return repo.findByNIC(nic);
	}
	
	// create a user
	public List<User> createUser(User user) throws Exception{
		user.setType(UserHelper.selectUserType(user.getType()));
		user.setPaymentMethod(UserHelper.selectPaymentMethod(user.getPaymentMethod()));
		repo.save(user);
		return repo.findAll();
	}
	
	// update a user
	public List<User> updateUser(User user) throws Exception{
		Optional<User> userFromDBResponse = repo.findById(user.getNic());
		User userFromDB = userFromDBResponse.get();
		
		// Set Details
		userFromDB.setNic(user.getNic());
		userFromDB.setFirstname(user.getFirstname());
		userFromDB.setLastname(user.getLastname());
		userFromDB.setEmail(user.getEmail());
		userFromDB.setContactNo(user.getContactNo());
		userFromDB.setType(UserHelper.selectUserType(user.getType()));
		userFromDB.setPaymentMethod(UserHelper.selectPaymentMethod(user.getPaymentMethod()));
		
		repo.save(userFromDB);
		return repo.findAll();
	}
	
	// delete a user
	public List<User> deleteUser(String id) throws Exception{
		repo.deleteById(id);
		return repo.findAll();
	}
}
