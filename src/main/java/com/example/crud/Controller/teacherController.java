package com.example.crud.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.crud.Service.teacherService;
import com.example.crud.entity.Subjects;
import com.example.crud.entity.Teacher;
import com.example.crud.repository.teacherRepository;



@RestController
@CrossOrigin(allowedHeaders="*",origins="*")
public class teacherController {
	@Autowired
	private teacherRepository repository;
	@Autowired
	private teacherService tservice;
	
	
	// http://localhost:8080/courses
	//@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/getTeacher")
	public List<Teacher> getTeacher(){
				return tservice.getSubjects();
	}
}
