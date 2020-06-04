package com.uop.co.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.uop.co.models.User;

public interface UserRepository extends JpaRepository<User, String> {
	
	@Query(value = "SELECT * FROM User u WHERE u.nic = ?1", nativeQuery = true)
	Optional<User> findByNIC(String nic);

}
