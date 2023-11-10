package com.springboot.spingcrud.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.spingcrud.dao.CourseDao;
import com.springboot.spingcrud.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseDao courseDao;

	@Override
	public List<Course> getAllCourse() {
		// TODO Auto-generated method stub
		
		return courseDao.findAll();
	}

	@Override
	public Course getCourseById(int courseId) {

	
		return courseDao.getReferenceById(courseId);
	}

	@Override
	public Course addCourse(Course course) {
		return courseDao.save(course);
	}

	@Override
	public Course updateCourse(Course course) {
	
		return courseDao.save(course);
	}

	@Override
	public void deleteCourse(int courseId) {
		courseDao.deleteById(courseId);
	}

}








//Without Spring data JPA and SQL
/*
 * @Service 
 * public class CourseServiceImpl implements CourseService {
 * 
 * List<Course> list;
 * 
 * public CourseServiceImpl() { list = new ArrayList<>(); list.add(new Course(1,
 * "Java", "This is Java tutorial", "Dhananjay")); list.add(new Course(2,
 * "J2EE", "This is J2EE tutorial", "Pratik")); list.add(new Course(3, "React",
 * "This is React tutorial", "Chetena")); list.add(new Course(4, "Angular",
 * "This is Angular tutorial", "Dhruv"));
 * 
 * }
 * 
 * @Override public List<Course> getAllCourse() { // TODO Auto-generated method
 * stub
 * 
 * return list; }
 * 
 * @Override public Course getCourseById(int courseId) {
 * 
 * Course c = null; for (Course course : list) { if (course.getId() == courseId)
 * { c = course; break; }
 * 
 * } return c; }
 * 
 * @Override public Course addCourse(Course course) { list.add(course); return
 * course; }
 * 
 * @Override public Course updateCourse(Course course) {
 * 
 * list.forEach(e -> { if(e.getId() == course.getId()) {
 * e.setCourseName(course.getCourseName());
 * e.setCourseDesc(course.getCourseDesc());
 * e.setCourseInstructor(course.getCourseInstructor()); } });
 * 
 * return course; }
 * 
 * @Override public void deleteCourse(int courseId) { list =
 * list.stream().filter(e-> e.getId() != courseId).collect(Collectors.toList());
 * 
 * }
 * 
 * }
 */