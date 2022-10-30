package com.example.crud.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.crud.Service.courseService;
import com.example.crud.Service.studentService;
import com.example.crud.entity.Course;
import com.example.crud.entity.Students;
import com.example.crud.repository.courseRepository;
import com.example.crud.repository.studenRepository;

@RestController
@CrossOrigin(allowedHeaders="*",origins="*")
public class studentController {
	@Autowired
    private studentService  stud_service ;
	@Autowired
	private studenRepository studentRepo;
	
	 private studentService  student_service ;
		
		@PostMapping("/registerstudent")
		public  Students registerstudent(@RequestBody Students student) {
			 return  student_service.registerStudent(student);
		}
		
		
		@GetMapping("/getStudent")
		public List<Students> getStudents(){
					return studentRepo.findAll();
		}
		
		@DeleteMapping("/deleteStudent")
		public void deleteStudents(@RequestParam Long id) {
			student_service.deleteStudent(id);
	     }
}
