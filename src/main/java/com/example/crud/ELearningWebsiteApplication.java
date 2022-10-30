package com.example.crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.example.crud.entity.Course;
import com.example.crud.entity.Students;
import com.example.crud.entity.Subjects;
import com.example.crud.repository.courseRepository;
import com.example.crud.repository.studenRepository;
//import com.example.crud.repository.studenRepository;
//import com.example.crud.repository.subjectsRepository;
//import com.example.crud.repository.teacherRepository;

@ComponentScan(basePackages = {"com.example.crud.Controller"})
@ComponentScan(basePackages = {"com.example.crud.Service"})
@ComponentScan(basePackages = {"com.example.crud.repository"})

@SpringBootApplication
/*
public class ELearningWebsiteApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ELearningWebsiteApplication.class, args);
	}

	/*
	@Autowired
	private	 courseRepository courserepo;
	
	@Autowired
	private	 studenRepository studentepo;
	//@Autowired
	//private	 subjectsRepository subjectsrepo;
	//@Autowired
	//private	 teacherRepository teacherrepo;

	
	
	
	@Override
	public void run(String... args) throws Exception {
		
		Course course1=new Course("JAVA");
		Course course2=new Course("OOPs");
		//Course course3=new Course("C & C++");
		
		Subjects sub1=new Subjects("one_sub");
		Subjects sub2=new Subjects("two_sub");
		Subjects sub3=new Subjects("three_sub");
		
		
		course1.getSubject().add(sub1);
		course1.getSubject().add(sub2);
		course1.getSubject().add(sub3);
		
		Students stud1=new Students ("adi");
		Students stud2=new Students ("vijaya");
		Students stud3=new Students ("vidya");
		
		course1.getStudent().add(stud1);
		course1.getStudent().add(stud2);
		course1.getStudent().add(stud3);
		
		
		stud1.getCourse().add(course1);
		stud2.getCourse().add(course1);
		stud3.getCourse().add(course1);
		
		stud1.getCourse().add(course2);
		course2.getStudent().add(stud1);
		
		//course2.getSubject().add(sub1);
		//course2.getSubject().add(sub2);
	//	course3.getSubject().add(sub3);
		
		//course3.getSubject().add(sub1);
		//course3.getSubject().add(sub2);
		//course3.getSubject().add(sub3);
		
		this.courserepo.save(course1);
		this.courserepo.save(course2);
		
		
		//this.courserepo.save(course2);
		//this.courserepo.save(course3);
		
		
	}

}*/

public class ELearningWebsiteApplication {

	public static void main(String[] args) {
		SpringApplication.run(ELearningWebsiteApplication.class, args);
	}
}

