package com.wfd.DemoProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.wfd.DemoProject.entity.ExamType;
import com.wfd.DemoProject.service.ExamTypeService;

@RequestMapping("/examtype")
@RestController
public class ExamTypeController {
	@Autowired
	ExamTypeService examTypeService;
	@RequestMapping(method = RequestMethod.POST)
	 public ExamType createExamType(@RequestBody ExamType pExamType) {
		  return examTypeService.createExamType(pExamType);
		 }
	 @RequestMapping(value = "/{examTypeId}", method = RequestMethod.GET)
	 public ExamType getExamType(@PathVariable Integer examTypeId) {
	  return examTypeService.getExamType(examTypeId);
	 }
   @RequestMapping(method = RequestMethod.PUT)
   public ExamType updateExamType(@RequestBody ExamType pExamType) {
   	  return examTypeService.updateExamType(pExamType);
   	 }
  @RequestMapping(value = "/{examTypeId}", method = RequestMethod.DELETE)
   public String deleteExamType(@PathVariable Integer examTypeId) {
   	  return examTypeService.deleteExamType(examTypeId);
   	 }

	

}
