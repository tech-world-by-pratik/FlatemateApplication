
package com.flatmate.entity;

import javax.persistence.*;

@Entity
public class Vote {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long complaintId;
    private String username;
    private boolean upvote;

    // Getters and Setters
}