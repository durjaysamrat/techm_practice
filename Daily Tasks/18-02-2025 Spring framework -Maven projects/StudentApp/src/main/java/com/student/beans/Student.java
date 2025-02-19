package com.student.beans;

public class Student {
    private String name;
    private int age;

    // Default Constructor
    public Student() {}

    // Constructor-based Injection
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter and Setter Methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + "}";
    }
}
