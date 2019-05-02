package com.wfd.DemoProject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.wfd.DemoProject.entity.Course;
import com.wfd.DemoProject.repository.CourseRepository;

@Service
public class CourseServiceImpl implements CourseService {
	@Autowired
	CourseRepository courseRepository;
	@Override
	public Course createCourse(@RequestBody Course pCourse) {
		
		return courseRepository.save(pCourse);
	}

	public Course getCourse(@PathVariable Integer courseId) {
		return courseRepository.findById(courseId).get();
	}

	public Course updateCourse(@RequestBody Course pCourse) {
		
		return courseRepository.save(pCourse);
	}

	public String deleteCourse(@PathVariable Integer courseId) {
		courseRepository.deleteById(courseId);
		return courseId + " Deleted successfully";
	}

	
	

}
