package com.jnit.services;

import java.time.LocalDateTime;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.jnit.model.Course;
import com.jnit.model.User;
import com.jnit.repositories.CourseRepository;

@Service
@Transactional
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseRepository courseRepository;

	@Override
	public Course createCourse(Course course) throws Exception {
		course.setCreatedDateTime(LocalDateTime.now());
		course.setUpdatedDateTime(LocalDateTime.now());
		return courseRepository.save(course);
	}

	@Override
	public Course updateCourse(Course course) throws Exception {
		course.setUpdatedDateTime(LocalDateTime.now());
		return courseRepository.save(course);
	}

	@Override
	public List<Course> getAllCourses() throws Exception {
		return courseRepository.findAll();
	}

	@Override
	public Course getCourseById(Long userId) throws Exception {
		return courseRepository.findOne(userId);
	}

	@Override
	public void deleteCourse(Long courseId) throws Exception {
		Course course = courseRepository.findOne(courseId);
		if (course == null) {
			throw new Exception("User with " + courseId + " not found");
		}
		courseRepository.delete(courseId);
	}

}
