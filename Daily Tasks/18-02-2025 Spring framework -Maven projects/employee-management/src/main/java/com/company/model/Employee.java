package com.company.model;

public class Employee {
    private int empId;
    private String empName;
    private String empDepartment;
    private double empSalary;

    // Getters and Setters
    public int getEmpId() { return empId; }
    public void setEmpId(int empId) { this.empId = empId; }

    public String getEmpName() { return empName; }
    public void setEmpName(String empName) { this.empName = empName; }

    public String getEmpDepartment() { return empDepartment; }
    public void setEmpDepartment(String empDepartment) { this.empDepartment = empDepartment; }

    public double getEmpSalary() { return empSalary; }
    public void setEmpSalary(double empSalary) { this.empSalary = empSalary; }

    @Override
    public String toString() {
        return "Employee [ID=" + empId + ", Name=" + empName + ", Department=" + empDepartment + ", Salary=" + empSalary + "]";
    }
}
