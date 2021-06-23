package com.driver.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.driver.models.Lin;

@Repository
public interface Repo2 extends CrudRepository<Lin ,Long> {
	List<Lin> findAll();

	public Lin findTopByOrderByNumberDesc();

}
