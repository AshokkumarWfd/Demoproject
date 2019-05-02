package com.wfd.DemoProject.controller;

//import java.lang.reflect.Method;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wfd.DemoProject.entity.Marks;
import com.wfd.DemoProject.service.MarksService;

@RequestMapping("/marks")
@RestController
public class MarksController {
	@Autowired
	MarksService marksService;
	@RequestMapping(method = RequestMethod.POST)
	public Marks createMarks(@RequestBody Marks pMarks) {
		return marksService.createMarks(pMarks);
		
	}
	@RequestMapping(value = "/{marksId}" , method = RequestMethod.GET)
	public Marks getMarkas(@PathVariable Integer marksId) {
		return marksService.getMarks(marksId);
	}
	@RequestMapping(method = RequestMethod.PUT)
	public Marks updateMarks(@RequestBody Marks pMarks) {
		return marksService.updateMarks(pMarks);	
	}
	 @RequestMapping(value = "/{marksId}", method = RequestMethod.DELETE)
	public String deleteMarks(@PathVariable Integer marksId) {
		return marksService.deleteMarks(marksId);
	}
	

}
