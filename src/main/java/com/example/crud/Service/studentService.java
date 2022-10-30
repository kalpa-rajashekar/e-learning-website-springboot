package com.example.crud.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crud.entity.Course;
import com.example.crud.entity.Students;
import com.example.crud.repository.courseRepository;
import com.example.crud.repository.studenRepository;

@Service
public class studentService {
	@Autowired
	private studenRepository studentRepo;
	
	public Students registerStudent(Students student) {
		return studentRepo.save( student);
	}

	public List<Students> getStudent() {
		return studentRepo.findAll();
	}

	public void deleteStudent(Long id) {
		studentRepo.deleteById(id);
	}
	
	
}
