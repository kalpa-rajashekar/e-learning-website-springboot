package com.example.crud.Controller;

import java.util.List;

import javax.security.auth.Subject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.crud.Service.courseService;
import com.example.crud.Service.subjectService;
import com.example.crud.entity.Course;
import com.example.crud.entity.Subjects;
import com.example.crud.repository.courseRepository;
import com.example.crud.repository.subjectsRepository;

@RestController
@CrossOrigin(allowedHeaders="*",origins="*")
public class subjectsController {
	
	@Autowired
    private subjectService  subject_service ;
	@Autowired
	private subjectsRepository subject;
	
	
	@PostMapping("/registerSubject")
	public  Subjects registerSubjects(@RequestBody Subjects subject) {
		 return  subject_service.registerSubjects(subject);
	}
	
	
	@GetMapping("/getSubject")
	public List<Subjects> getSubjects(){
				return subject.findAll();
	}
	
	@DeleteMapping("/deleteSubject")
	public void deleteSubjects(@RequestParam Long id) {
		subject_service.deleteSubjects(id);
     }

}
