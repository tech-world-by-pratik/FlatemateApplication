package com.flatmate.entity;

// package com.flatmate.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Complaint {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private String complaintType;
    private String severityLevel;
    private LocalDateTime timestamp;
    private String flatCode;
    private String createdBy;

    // Getters and Setters
}