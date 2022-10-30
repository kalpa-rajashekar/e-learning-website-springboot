package com.example.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.crud.entity.Course;

@Repository
public interface courseRepository extends JpaRepository<Course,Long> {

}
