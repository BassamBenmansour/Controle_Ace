package com.example.studentapp.mapper;

import com.example.studentapp.dao.entities.Student;
import com.example.studentapp.dto.StudentDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class StudentMapper {
    public StudentDTO toDTO(Student student) {
        ModelMapper mapper = new ModelMapper();
        return mapper.map(student, StudentDTO.class);
    }

    public Student toEntity(StudentDTO studentDTO) {
        ModelMapper mapper = new ModelMapper();
        return mapper.map(studentDTO, Student.class);
    }
}

