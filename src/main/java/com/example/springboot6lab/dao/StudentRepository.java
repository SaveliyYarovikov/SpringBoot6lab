package com.example.springboot6lab.dao;

import com.example.springboot6lab.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
