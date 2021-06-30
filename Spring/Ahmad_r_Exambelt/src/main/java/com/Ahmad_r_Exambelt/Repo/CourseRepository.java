package com.Ahmad_r_Exambelt.Repo;


import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Ahmad_r_Exambelt.models.Course;


@Repository
public interface CourseRepository extends CrudRepository<Course, Long> {
	List<Course> findAll();
	
}
