package com.truaton.backend;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class InternshipApplication {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String educationLevel;
    private String institution;
    private String experience;
}