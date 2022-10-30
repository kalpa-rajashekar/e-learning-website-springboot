package com.example.crud.entity;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity

public class Course {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	
	private String title;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="cousrse_subject_id",referencedColumnName="id")
	List<Subjects> subject=new ArrayList<>();
	
	@ManyToMany(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	@JoinTable(name="course_students",
	joinColumns= {@JoinColumn(name="course_id")},
	inverseJoinColumns= {@JoinColumn(name="stud_id")}
	)
	private Set<Students> student=new HashSet<>();
	
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="tid")
	private Teacher  teachers;
	
	
	

	public Course()
	{
		
	}
	
	public Set<Students> getStudent() {
		return student;
	}


	public void setStudent(Set<Students> student) {
		this.student = student;
	}


	
	
	
	public Course(String title) {
		super();
		this.title = title;
	}


	
	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public List<Subjects> getSubject() {
		return subject;
	}


	public void setSubject(List<Subjects> subject) {
		this.subject = subject;
	}
	
	public Teacher getTeachers() {
		return teachers;
	}

	public void setTeachers(Teacher teachers) {
		this.teachers = teachers;
	}

}
