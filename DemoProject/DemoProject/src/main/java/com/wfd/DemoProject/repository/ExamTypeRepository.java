package com.wfd.DemoProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wfd.DemoProject.entity.ExamType;

public interface ExamTypeRepository extends JpaRepository <ExamType, Integer>{
	
}
