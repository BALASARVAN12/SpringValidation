package com.bala.validation.model;

import com.bala.validation.custom.ValidPassword;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import org.hibernate.validator.constraints.CreditCardNumber;

@Entity
@Table(name = "Users")
public class User {
    @Id
    private int id;

    @NotEmpty(message = "User name should not be null")
    private String name;

    @NotBlank(message = "Email is required")
    @Email(message = "Invalid format")
    private String email;

    @Pattern(regexp = "^\\d{10}$", message = "Invalid mobile number")
    private String mobile;

    @Min(value = 18, message = "Age should be at least 18")
    @Max(value = 60, message = "Age should not exceed 60")
    private int age;

    @Positive(message = "Salary must be a positive number")
    private int salary;

    @ValidPassword
    private String password;


    public User() {}

    public User(int id, String name, String email, String mobile, int age, int salary, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.mobile = mobile;
        this.age = age;
        this.salary = salary;
        this.password = password;
    }

    public User(int id, String name, String email, String mobile, int age, int salary) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.mobile = mobile;
        this.age = age;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    // Getters and Setters
}
