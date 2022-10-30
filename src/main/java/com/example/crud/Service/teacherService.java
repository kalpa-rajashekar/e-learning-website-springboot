package com.example.crud.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crud.entity.Course;
import com.example.crud.entity.Teacher;
import com.example.crud.repository.studenRepository;
import com.example.crud.repository.teacherRepository;

@Service
public class teacherService {
	@Autowired
	private teacherRepository teachertRepo;
	
	public List<Teacher> getSubjects() {
		// TODO Auto-generated method stub
		return teachertRepo.findAll();
	}

	


}
