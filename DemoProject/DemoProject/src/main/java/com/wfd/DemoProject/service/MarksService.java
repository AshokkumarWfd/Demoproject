package com.wfd.DemoProject.service;

import com.wfd.DemoProject.entity.Marks;

public interface MarksService {
	Marks createMarks(Marks pMarks);
	Marks getMarks(Integer marksId);
	Marks updateMarks(Marks pMarks);
	String deleteMarks(Integer marksId);

}
