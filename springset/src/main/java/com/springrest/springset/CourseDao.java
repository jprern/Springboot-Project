package com.springrest.springset;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrest.springset.entities.Course;

public interface CourseDao extends JpaRepository<Course, Long>{

	
	
}
