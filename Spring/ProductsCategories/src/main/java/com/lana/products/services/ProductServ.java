package com.lana.products.services;



import java.util.List;

import org.springframework.stereotype.Service;

import com.lana.products.models.Category;
import com.lana.products.models.CategoryProduct;
import com.lana.products.models.Product;
import com.lana.products.repositories.CategoryRepo;
import com.lana.products.repositories.ProductRepo;
import com.lana.products.repositories.RelationRepo;

@Service
public class ProductServ {
	private final ProductRepo productRepo;
	private final CategoryRepo categoryRepo;
	private final RelationRepo relationRepo;
	public ProductServ(ProductRepo productRepo, CategoryRepo categoryRepo,RelationRepo relationRepo) {
		this.productRepo = productRepo;
		this.categoryRepo = categoryRepo;
		this.relationRepo = relationRepo;
	}
	
	public Product createProduct(Product p) {
		return productRepo.save(p);
	}
	
	public List<Product> allProducts(){
		return productRepo.findAll();
	}
	
	public Product findProduct(Long id) {
		return productRepo.findById(id).orElse(null);
	}
	
	public List<Product> productsNotContainigCat(Category cat){
		return productRepo.findByCategoriesNotContains(cat);
	}
	/////////////////////////////////////////////////////////
	
	public Category createCategory(Category c) {
		return categoryRepo.save(c);
	}
	public List<Category> allCategories(){
		return categoryRepo.findAll();
	}
	
	public Category findCategory(Long id) {
		return categoryRepo.findById(id).orElse(null);
	}
	
	public List<Category> categoriesNotContainigPro(Product pro){
		return categoryRepo.findByProductsNotContains(pro);
	}
	
	public CategoryProduct createRelation(CategoryProduct relation) {
		return relationRepo.save(relation);
	}
}
