package com.example.studentapp.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class StudentDTO {
    private String name;
    private String email;
    private LocalDate dateNaissance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(LocalDate dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    // Getters et Setters (ou utilisez @Data)
}
