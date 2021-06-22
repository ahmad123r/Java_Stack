package com.example.demo.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.models.*;


@Repository
public interface repos extends CrudRepository< models, Long> {
	 List<models> findAll();
	 List<models> findById(long id);
	 Optional <models> findByName(String name);
	  // this method finds books with descriptions containing the search string
	 // this method counts how many titles contain a certain string
	 Long countByNameContaining(String search);
	 // this method deletes a book that starts with a specific title
	 Long deleteByNameStartingWith(String search);
	 List<models> findTop10ByOrderByRatingDesc();
	 

}
