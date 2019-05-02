package com.wfd.DemoProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wfd.DemoProject.entity.Course;

public interface CourseRepository extends JpaRepository <Course, Integer>{
	

}
