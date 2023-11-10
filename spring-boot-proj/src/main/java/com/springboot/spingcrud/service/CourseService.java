package com.springboot.spingcrud.service;

import java.util.List;
import com.springboot.spingcrud.entities.Course;


public interface CourseService {
	
	public List<Course> getAllCourse();
	
	public Course getCourseById(int courseId); 
	
	public Course addCourse(Course course);

	public Course updateCourse(Course course);

	public void deleteCourse(int courseId);

}
