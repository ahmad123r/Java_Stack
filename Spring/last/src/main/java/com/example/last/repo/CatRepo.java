package com.example.last.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.last.models.Category;
@Repository
public interface CatRepo extends CrudRepository<Category , Long> {
	List<Category> findAll();
	List <Category> findByProductsIdIsNull();
	

}
