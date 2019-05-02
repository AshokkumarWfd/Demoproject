package com.wfd.DemoProject.service;

import com.wfd.DemoProject.entity.Course;
public interface CourseService {
	Course createCourse(Course pCourse);
	Course getCourse(Integer CourseId);
	Course updateCourse(Course pCourse);
	String deleteCourse(Integer CourseId);

}
