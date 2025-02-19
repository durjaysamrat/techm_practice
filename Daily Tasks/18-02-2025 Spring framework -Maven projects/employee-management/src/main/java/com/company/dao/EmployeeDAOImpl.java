package com.company.dao;

import com.company.model.Employee;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class EmployeeDAOImpl implements EmployeeDAO {
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void addEmployee(Employee employee) {
        String sql = "INSERT INTO employees (emp_name, emp_department, emp_salary) VALUES (?, ?, ?)";
        jdbcTemplate.update(sql, employee.getEmpName(), employee.getEmpDepartment(), employee.getEmpSalary());
    }

    @Override
    public void updateEmployee(Employee employee) {
        String sql = "UPDATE employees SET emp_name=?, emp_department=?, emp_salary=? WHERE emp_id=?";
        jdbcTemplate.update(sql, employee.getEmpName(), employee.getEmpDepartment(), employee.getEmpSalary(), employee.getEmpId());
    }

    @Override
    public void deleteEmployee(int empId) {
        String sql = "DELETE FROM employees WHERE emp_id=?";
        jdbcTemplate.update(sql, empId);
    }

    @Override
    public Employee getEmployeeById(int empId) {
        String sql = "SELECT * FROM employees WHERE emp_id=?";
        return jdbcTemplate.queryForObject(sql, new EmployeeRowMapper(), empId);
    }

    @Override
    public List<Employee> getAllEmployees() {
        String sql = "SELECT * FROM employees";
        return jdbcTemplate.query(sql, new EmployeeRowMapper());
    }

    private static class EmployeeRowMapper implements RowMapper<Employee> {
        public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
            Employee employee = new Employee();
            employee.setEmpId(rs.getInt("emp_id"));
            employee.setEmpName(rs.getString("emp_name"));
            employee.setEmpDepartment(rs.getString("emp_department"));
            employee.setEmpSalary(rs.getDouble("emp_salary"));
            return employee;
        }
    }
}
