package com.springcourse.FirstSecurityApp.models;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name = "Person")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @NotEmpty
    @Size(min = 2, max = 100, message = "The name must be between 2 and 100 letters.")
    @Column(name = "username")
    private String userName;

    @Min(value = 1900, message = "The year must be greater than 1900")
    @Column (name = "year_of_birth")
    private String yearOfBirth;

    @Column (name = "password")
    private String password;

    public Person() {
    }

    public Person(String userName, String yearOfBirth) {
        this.userName = userName;
        this.yearOfBirth = yearOfBirth;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(String yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", yearOfBirth='" + yearOfBirth + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
