package com.wfd.DemoProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wfd.DemoProject.entity.Student;
import com.wfd.DemoProject.service.StudentService;

@RequestMapping("/student")
@RestController
public class StudentController {
	@Autowired
	StudentService studentService;
	@RequestMapping(method = RequestMethod.POST)
	 public Student createStudent(@RequestBody Student pStudent) {
		  return studentService.createStudent(pStudent);
		 }
	 @RequestMapping(value = "/{studentId}", method = RequestMethod.GET)
	 public Student getStudent(@PathVariable Integer studentId) {
	  return studentService.getStudent(studentId);
	 }
   @RequestMapping(method = RequestMethod.PUT)
   public Student updateStudent(@RequestBody Student pStudent) {
   	  return studentService.updateStudent(pStudent);
   	 }
   @RequestMapping(value = "/{studentId}", method = RequestMethod.DELETE)
   public String deleteStudent(@PathVariable Integer studentId) {
   	  return studentService.deleteStudent(studentId);
   	 }

}
