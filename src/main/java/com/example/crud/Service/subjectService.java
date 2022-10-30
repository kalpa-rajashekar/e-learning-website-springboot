package com.example.crud.Service;

import java.util.List;

import javax.security.auth.Subject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crud.entity.Course;
import com.example.crud.entity.Subjects;
import com.example.crud.repository.courseRepository;
import com.example.crud.repository.subjectsRepository;

@Service
public class subjectService {
	@Autowired
	private subjectsRepository subjecRepo;
	
	public Subjects registerSubjects(Subjects subject) {
		return subjecRepo.save(subject);
	}

	public List<Subjects> getSubjects() {
		return (List<Subjects>) subjecRepo.findAll();
	}

	public void deleteSubjects(Long id) {
		subjecRepo.deleteById(id);
	}

	
}
