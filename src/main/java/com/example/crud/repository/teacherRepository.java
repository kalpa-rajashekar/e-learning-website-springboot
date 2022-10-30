package com.example.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.crud.entity.Course;
import com.example.crud.entity.Teacher;

public interface teacherRepository extends JpaRepository<Teacher,Long> {
}



