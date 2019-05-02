package com.wfd.DemoProject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.wfd.DemoProject.entity.Marks;
import com.wfd.DemoProject.repository.MarksRepository;

@Service
public class MarksServiceImpl implements MarksService  {

	@Autowired
	MarksRepository marksRepository;
	@Override
	public Marks createMarks(@RequestBody Marks pMarks) {
		return marksRepository.save(pMarks);
	}
	@Override
	public Marks getMarks(@PathVariable Integer marksId) {
		return marksRepository.findById(marksId).get();
	}
	public Marks updateMarks(@RequestBody Marks pMarks) {
		return marksRepository.save(pMarks);
	}
	public String deleteMarks(@PathVariable Integer marksId) {
		marksRepository.deleteById(marksId);
		return marksId + " Delete Sucessfully";
	}
	

}
