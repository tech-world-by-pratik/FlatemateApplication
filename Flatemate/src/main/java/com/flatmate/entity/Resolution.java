
package com.flatmate.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Resolution {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long complaintId;
    private String resolvedBy;
    private LocalDateTime resolvedAt;

    // Getters and Setters
}