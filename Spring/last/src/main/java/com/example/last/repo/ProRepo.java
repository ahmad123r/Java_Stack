package com.example.last.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.last.models.Category;
import com.example.last.models.Product;
@Repository
public interface ProRepo extends CrudRepository<Product,Long> {
	List<Product> findAll();
	List <Product> findByCategoriesIdIsNull();
	

}
