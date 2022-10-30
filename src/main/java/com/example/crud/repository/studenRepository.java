package com.example.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.crud.entity.Students;

@Repository
public interface studenRepository extends JpaRepository<Students,Long> {

}
