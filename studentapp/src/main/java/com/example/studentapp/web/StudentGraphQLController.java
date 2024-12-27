package com.example.studentapp.web;

import com.example.studentapp.dto.StudentDTO;
import com.example.studentapp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/graphql")
public class StudentGraphQLController {
    @Autowired
    private StudentService studentService;

    @QueryMapping
    public List<StudentDTO> getStudentByDateNaissance(@Argument String date) {
        return studentService.getStudentsByDateNaissance(LocalDate.parse(date));
    }

    @MutationMapping
    public StudentDTO saveStudent(@Argument StudentDTO studentDTO) {
        return studentService.saveStudent(studentDTO);
    }
}

