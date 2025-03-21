package com.example.EmployeePayrollApp.service;

import com.example.EmployeePayrollApp.model.Employee;
import com.example.EmployeePayrollApp.dto.EmployeeDTO;

import java.util.List;
import java.util.Optional;

public interface IEmployeeService {

    List<EmployeeDTO> getAllEmployees();

    EmployeeDTO createEmployee(EmployeeDTO employeeDTO);

    EmployeeDTO getEmployeeById(Long id);

    EmployeeDTO updateEmployee(Long id ,EmployeeDTO employeeDTO);

    void deleteEmployee(Long id);
}
