package com.wfd.DemoProject.service;

import com.wfd.DemoProject.entity.ExamType;


public interface ExamTypeService {
	ExamType createExamType(ExamType pExamType);
	ExamType getExamType(Integer ExamTypeId);
	ExamType updateExamType(ExamType pExamType);
	String deleteExamType(Integer ExamTypeId);

}
