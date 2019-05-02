package com.wfd.DemoProject.service;

import com.wfd.DemoProject.entity.Student;

public interface StudentService {
	Student createStudent(Student pStudent);
	Student getStudent(Integer StudentId);
	Student updateStudent(Student pStudent);
	String deleteStudent(Integer StudentId);

}
