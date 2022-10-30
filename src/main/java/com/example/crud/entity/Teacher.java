package com.example.crud.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Teacher {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long tid;
	
	private String teacher_name;
	
	
	
	//private Set<Course> course;
	
	public Teacher()
	{
		
	}
	

	public Teacher(String teacher_name) {
		super();
		this.teacher_name = teacher_name;
	}

	public long getId() {
		return tid;
	}

	public void setId(long id) {
		this.tid = id;
	}

	public String getTeacher_name() {
		return teacher_name;
	}

	public void setTeacher_name(String teacher_name) {
		this.teacher_name = teacher_name;
	}

	/*public Set<Course> getCourse() {
		return course;
	}

	public void setCourse(Set<Course> course) {
		this.course = course;
	}
	*/
	
	

}