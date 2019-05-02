package com.wfd.DemoProject.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.wfd.DemoProject.entity.ExamType;
import com.wfd.DemoProject.repository.ExamTypeRepository;


@Service
public class ExamTypeServiceImpl implements ExamTypeService {
	
	@Autowired
	ExamTypeRepository examTypeRepository;
	@Override
	public ExamType createExamType(@RequestBody ExamType pExamType) {
		
		return examTypeRepository.save(pExamType);
	}

	public ExamType getExamType(@PathVariable Integer examTypeId) {
		return examTypeRepository.findById(examTypeId).get();
	}

	public ExamType updateExamType(@RequestBody ExamType pExamType) {
		
		return examTypeRepository.save(pExamType);
	}

	public String deleteExamType(@PathVariable Integer examTypeId) {
		examTypeRepository.deleteById(examTypeId);
		return examTypeId + " Deleted successfully";
	}

	
	

}
