package com.wfd.DemoProject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.wfd.DemoProject.entity.Student;
import com.wfd.DemoProject.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	StudentRepository studentRepository;
	@Override
	public Student createStudent(@RequestBody Student pStudent) {
		
		return studentRepository.save(pStudent);
	}

	public Student getStudent(@PathVariable Integer studentId) {
		return studentRepository.findById(studentId).get();
	}

	public Student updateStudent(@RequestBody Student pStudent) {
		
		return studentRepository.save(pStudent);
	}

	public String deleteStudent(@PathVariable Integer studentId) {
		studentRepository.deleteById(studentId);
		return studentId + " Deleted successfully";
	}

	

	


}
