package com.flatmate.entity;

// package com.flatmate.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    private String email;
    private String flatCode;
    private String roles;

    // Getters and Setters
}