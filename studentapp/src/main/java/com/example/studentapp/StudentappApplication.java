package com.example.studentapp;

import com.example.studentapp.dao.entities.Student;
import com.example.studentapp.dao.repositories.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;

@SpringBootApplication
public class StudentappApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentappApplication.class, args);
    }


    @Bean
    CommandLineRunner initDatabase(StudentRepository studentRepository) {
        return args -> {
            studentRepository.save(new Student(null, "Alice", "alice@example.com", LocalDate.of(2000, 1, 1)));
            studentRepository.save(new Student(null, "Bob", "bob@example.com", LocalDate.of(1999, 5, 15)));
            studentRepository.save(new Student(null, "Charlie", "charlie@example.com", LocalDate.of(2001, 8, 20)));
            studentRepository.save(new Student(null, "Diana", "diana@example.com", LocalDate.of(1998, 12, 12)));
            System.out.println("Database initialized with sample data.");
        };
    }
}
