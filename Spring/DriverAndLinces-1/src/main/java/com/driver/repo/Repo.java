package com.driver.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import com.driver.models.Person;



@Repository
public interface Repo extends CrudRepository<Person, Long> {
 List<Person> findAll();
 Optional<Person> findById(Long id);
 
 }
