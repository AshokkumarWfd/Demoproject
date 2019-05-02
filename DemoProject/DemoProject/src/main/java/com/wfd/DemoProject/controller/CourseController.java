package com.wfd.DemoProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wfd.DemoProject.entity.Course;
import com.wfd.DemoProject.service.CourseService;

@RequestMapping("/course")
@RestController
public class CourseController {
	@Autowired
	CourseService courseService;
	@RequestMapping(method = RequestMethod.POST)
	 public Course createCourse(@RequestBody Course pCourse) {
		  return courseService.createCourse(pCourse);
		 }
	 @RequestMapping(value = "/{courseId}", method = RequestMethod.GET)
	 public Course getCourse(@PathVariable Integer courseId) {
	  return courseService.getCourse(courseId);
	 }
   @RequestMapping(method = RequestMethod.PUT)
   public Course updateCourse(@RequestBody Course pCourse) {
   	  return courseService.updateCourse(pCourse);
   	 }
   @RequestMapping(value = "/{courseId}", method = RequestMethod.DELETE)
   public String deleteCourse(@PathVariable Integer courseId) {
   	  return courseService.deleteCourse(courseId);
   	 }

	

}
