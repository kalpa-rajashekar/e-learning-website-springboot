package com.example.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.example.crud.entity.Subjects;


	@Repository
	public interface subjectsRepository extends JpaRepository<Subjects,Long> {

	}


