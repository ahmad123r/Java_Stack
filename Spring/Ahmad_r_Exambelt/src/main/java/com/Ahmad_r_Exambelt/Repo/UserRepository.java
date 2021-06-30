package com.Ahmad_r_Exambelt.Repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Ahmad_r_Exambelt.models.User;


	@Repository
	public interface UserRepository extends CrudRepository<User, Long> {
	    User findByEmail(String email);
	    List<User> findAll();
	}


