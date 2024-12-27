package com.example.studentapp.service;

import com.example.studentapp.dto.StudentDTO;

import java.time.LocalDate;
import java.util.List;

public interface StudentService {
    List<StudentDTO> getStudentsByDateNaissance(LocalDate date);
    StudentDTO saveStudent(StudentDTO studentDTO);
}

