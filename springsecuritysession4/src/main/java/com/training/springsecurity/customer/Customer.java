package com.training.springsecurity.customer;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @NotBlank(message = "E-mail is mandatory")
    String email;

    @NotBlank(message = "Password is mandatory")
    String pwd;
    @NotBlank(message = "Role is mandatory")
    String role;

    public Customer(String email, String pwd, String role) {
        this.email = email;
        this.pwd = pwd;
        this.role = role;
    }

    public Customer() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
