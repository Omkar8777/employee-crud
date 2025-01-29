package com.example.myfirst_demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="emp_db")
public class empentity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;    
    
    private String name;
    private String phone;
    private String email;

    
}
