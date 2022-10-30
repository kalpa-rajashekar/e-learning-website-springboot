package com.example.crud.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.crud.Service.courseService;
import com.example.crud.entity.Course;
import com.example.crud.repository.courseRepository;


@RestController
@CrossOrigin(allowedHeaders="*",origins="*")
public class courseController {
	@Autowired
    private courseService  course_service ;
	@Autowired
	private courseRepository courseRepo;
	
	@PostMapping("/registerCourse")
	public  Course registerCourse(@RequestBody Course course) {
		 return  course_service.registerCourse(course);
	}
	
	
	@GetMapping("/getCourse")
	public List<Course> getCourse(){
				return courseRepo.findAll();
		
	}
	
	@GetMapping("/Getcourses")
	public Course getCourseDetails(@RequestParam("id") long id) {
		
		Optional<Course> course = courseRepo.findById(id);
		
		if(!course.isPresent()) {
			throw new RuntimeException("Course not found with id " + id);
		}
	
		return course.get();
	}
	 
	
	@DeleteMapping("/deleteCourse")
	public void deleteCourse(@RequestParam Long id) {
		course_service.deleteCourse(id);
     }
	/*
	@PutMapping("/updateCourse")
	public Course updateCourse(@RequestBody Course course) {
		return course_service.updateCourse(course);
	}*/

}
