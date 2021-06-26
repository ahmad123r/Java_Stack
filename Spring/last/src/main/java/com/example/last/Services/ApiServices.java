package com.example.last.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.last.models.Category;
import com.example.last.models.Product;
import com.example.last.repo.CatRepo;
import com.example.last.repo.ProRepo;



@Service
public class ApiServices {
	private final ProRepo productRepo;
	private final CatRepo categoryRepo;
	public ApiServices(ProRepo productRepo, CatRepo categoryRepo) {
		this.productRepo = productRepo;
		this.categoryRepo = categoryRepo;
	}
	
	public Product createproduct(Product p) {
		
		return productRepo.save(p);
	}
	
	public Category createcategory(Category c) {
		
		return categoryRepo.save(c);
	}
	
	public List<Category> allNullCategory() {
		return categoryRepo.findByProductsIdIsNull();
		}
	
	public List<Category> allCat() {
		return categoryRepo.findAll();
		}
	
	public Optional<Product> getPro(long id) {
		return productRepo.findById(id);
	}
	
	public List<Category> allNullCat() {
		return categoryRepo.findByProductsIdIsNull();
		}

	
	public List<Product> allNullPro() {
		return productRepo.findAll();
		}

}
