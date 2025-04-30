package com.example.jpaclient.repository;

import com.example.jpaclient.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}