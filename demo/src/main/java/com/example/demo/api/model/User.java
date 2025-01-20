package com.example.demo.api.model;

public class User {

    private Integer id;
    private String name;
    private Integer age;
    private String email;

    // Constructor
    public User(int id, String name, int age, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
    }

    // Getter for ID
    public Integer getId() {
        return id;
    }

    // Setter for ID
    public void setId(Integer id) {
        this.id = id;
    }

    // Getter for Name
    public String getName() {
        return name;
    }

    // Setter for Name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for Age
    public Integer getAge() {
        return age;
    }

    // Setter for Age
    public void setAge(Integer age) {
        this.age = age;
    }

    // Getter for Email
    public String getEmail() {
        return email;
    }

    // Setter for Email
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }
}
