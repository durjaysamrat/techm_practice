package com.student.service;

import com.student.beans.Student;

public class StudentServiceImpl implements StudentService {
    private Student student;

    // Constructor-based Injection
    public StudentServiceImpl(Student student) {
        this.student = student;
    }

    // Setter-based Injection
    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public void addStudent(Student student) {
        this.student = student;
    }

    @Override
    public void displayStudentInfo() {
        System.out.println("Student Info: " + student.toString());
    }
}
