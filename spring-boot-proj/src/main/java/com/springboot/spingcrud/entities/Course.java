package com.springboot.spingcrud.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "courses")
public class Course {

	@Id
	@Column(name = "course_id")
	private int id;
	
	@Column(name = "course_name")
	private String courseName;
	
	@Column(name = "course_desc")
	private String courseDesc;
	
	@Column(name = "course_instructor")
	private String courseInstructor;

	public Course() {

	}

	public Course(int id, String courseName, String courseDesc, String courseInstructor) {
		this.id = id;
		this.courseName = courseName;
		this.courseDesc = courseDesc;
		this.courseInstructor = courseInstructor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseDesc() {
		return courseDesc;
	}

	public void setCourseDesc(String courseDesc) {
		this.courseDesc = courseDesc;
	}

	public String getCourseInstructor() {
		return courseInstructor;
	}

	public void setCourseInstructor(String courseInstructor) {
		this.courseInstructor = courseInstructor;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", courseName=" + courseName + ", courseDesc=" + courseDesc + ", courseInstructor="
				+ courseInstructor + "]";
	}
	
	

}
