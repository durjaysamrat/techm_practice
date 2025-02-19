package com.company.dao;

import com.company.model.Employee;
import java.util.List;

public interface EmployeeDAO {
    void addEmployee(Employee employee);
    void updateEmployee(Employee employee);
    void deleteEmployee(int empId);
    Employee getEmployeeById(int empId);
    List<Employee> getAllEmployees();
}
