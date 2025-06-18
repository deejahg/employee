package com.example.employee;

import jakarta.persistence.*;

@Entity
public class Employee {
    @Id @GeneratedValue
    private Long id;

    private String name;
    private String role;

    // Constructors
    public Employee() {}
    public Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }

    // Getters & Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }
}
