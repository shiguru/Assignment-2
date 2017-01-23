package com.jnit.services;

import java.util.List;
import com.jnit.model.Course;
import com.jnit.model.User;

public interface CourseService {

	public Course createCourse(Course course) throws Exception;

	public Course updateCourse(Course course) throws Exception;

	public List<Course> getAllCourses() throws Exception;

	public Course getCourseById(Long CourseId) throws Exception;

	public void deleteCourse(Long courseId) throws Exception;

}
