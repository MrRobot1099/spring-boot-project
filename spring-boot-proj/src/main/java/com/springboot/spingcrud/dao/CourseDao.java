package com.springboot.spingcrud.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.spingcrud.entities.Course;

public interface CourseDao extends JpaRepository<Course, Integer>{

}
