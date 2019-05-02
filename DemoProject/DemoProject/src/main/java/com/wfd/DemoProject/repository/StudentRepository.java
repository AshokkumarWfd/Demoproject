package com.wfd.DemoProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.wfd.DemoProject.entity.Student;

public interface StudentRepository extends JpaRepository <Student, Integer> {

}
