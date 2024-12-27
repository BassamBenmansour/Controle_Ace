package com.example.studentapp.service;

import com.example.studentapp.dao.entities.Student;
import com.example.studentapp.dao.repositories.StudentRepository;
import com.example.studentapp.dto.StudentDTO;
import com.example.studentapp.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentManager implements StudentService {
    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private StudentMapper studentMapper;

    @Override
    public List<StudentDTO> getStudentsByDateNaissance(LocalDate date) {
        List<Student> students = studentRepository.findByDateNaissance(date);
        return students.stream()
                .map(studentMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public StudentDTO saveStudent(StudentDTO studentDTO) {
        Student student = studentMapper.toEntity(studentDTO);
        Student savedStudent = studentRepository.save(student);
        return studentMapper.toDTO(savedStudent);
    }
}

