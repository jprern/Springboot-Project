package com.springrest.springset.services;


import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.springrest.springset.CourseDao;
import com.springrest.springset.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseDao courseDao;
	// List<Course> list;

	public CourseServiceImpl() {
	//	list = new ArrayList<Course>();
		//list.add(new Course(145, "Java core course", "this course contains basic of java"));
		//list.add(new Course(146, "springboott course", "this course contains basic of spring boot"));
	
	
	}

	public List<Course> getCourse() {
		
		return courseDao.findAll();
	}

	public Course getCourse(long courseId) {
		// TODO Auto-generated method stub
	//	Course c = null;
		//for (Course course : list) {
		//	if (course.getId() == courseId) {
		//		c = course;
		//		break;
		//	}
	//	}
		return courseDao.getOne(courseId);
	}

	public Course addCourse(Course course) {
		//list.add(course);
		courseDao.save(course);
		return course;
	}

	public Course updateCourse(Course course)
	{
		/*
		 * list.forEach(e ->{ if(e.getId()==course.getId()) {
		 * e.setTitle(course.getTitle()); e.setDescription(course.getDescription());
		 * 
		 * } });
		 */
		courseDao.save(course);
		return course;
}

	@Override
	public void deleteCourse(long parseLong) {
		// TODO Auto-generated method stub
	//	list=this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
		Course entity=courseDao.getOne(parseLong);
		courseDao.delete(entity);
			}
}
