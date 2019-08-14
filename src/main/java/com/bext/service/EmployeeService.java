package com.bext.service;

import java.util.List;

import com.bext.domain.Employee;

public interface EmployeeService {
	public List<Employee> getAllEmployees();
	public void addNewEmployee(Employee employee);
}
