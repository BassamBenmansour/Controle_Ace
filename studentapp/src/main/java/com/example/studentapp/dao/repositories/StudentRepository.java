package com.example.studentapp.dao.repositories;

import com.example.studentapp.dao.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    List<Student> findByDateNaissance(LocalDate dateNaissance);
}
