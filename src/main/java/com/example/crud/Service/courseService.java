package com.example.crud.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crud.entity.Course;
import com.example.crud.repository.courseRepository;


@Service
public class courseService {

	
	@Autowired
	private courseRepository courseRepo;
	
	public Course registerCourse(Course course) {
		return courseRepo.save(course);
	}

	public List<Course> getCourse() {
		return  courseRepo.findAll();
	}

	public void deleteCourse(Long id) {
		courseRepo.deleteById(id);
	}

	

	/*public Course updateCourse(Course course) {
		Long rollNumber=course.getRollNumber();
		Student std = studentRepository.findById(rollNumber).get();
		std.setName(student.getName());
		std.setAddress(student.getAddress());
		return studentRepository.save(std);
	}*/

}
