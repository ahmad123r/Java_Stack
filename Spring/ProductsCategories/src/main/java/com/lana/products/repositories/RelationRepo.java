package com.lana.products.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.lana.products.models.CategoryProduct;
@Repository
public interface RelationRepo extends CrudRepository<CategoryProduct, Long>{

}
