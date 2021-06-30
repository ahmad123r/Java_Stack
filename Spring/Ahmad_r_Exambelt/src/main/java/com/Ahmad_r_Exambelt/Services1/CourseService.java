package com.Ahmad_r_Exambelt.Services1;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.Ahmad_r_Exambelt.Repo.CourseRepository;
import com.Ahmad_r_Exambelt.models.Course;




	@Service
	public class CourseService {
		private final CourseRepository courseRepo;
		
		public CourseService(CourseRepository courseRepo) {
			this.courseRepo = courseRepo;
		}
		

		public List<Course> findAllCourses(){
			return courseRepo.findAll();
		}
		

		
		public Course findCourseById(Long id) {
			Optional<Course> myCourse = courseRepo.findById(id);
			if(myCourse.isPresent()) {
				return myCourse.get();
			}else {
				return null;
			}
		}
		
		
		public Course createCourse(Course myCourse) {
			return courseRepo.save(myCourse);
		}

		public void updateCourse(Course myCourse) {
			courseRepo.save(myCourse);
		}
	
		public void deleteCourse(Course course) {
			courseRepo.delete(course);
		}

	}
