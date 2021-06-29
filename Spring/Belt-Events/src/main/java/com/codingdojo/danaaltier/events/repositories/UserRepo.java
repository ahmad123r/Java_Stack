package com.codingdojo.danaaltier.events.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.danaaltier.events.models.User;

@Repository
public interface UserRepo extends CrudRepository <User, Long> {
	
	  User findByEmail(String email);
	  
}
