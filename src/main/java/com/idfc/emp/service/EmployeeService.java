package com.idfc.emp.service;

import com.idfc.emp.pojo.Employee;
import com.idfc.emp.repository.EmployeeRepository;
import jakarta.inject.Inject;

import javax.transaction.Transactional;

@Transactional
public class EmployeeService {
    @Inject
    EmployeeRepository employeeRepository;

    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }

    public Iterable<Employee> findAll(){
        return employeeRepository.findAll();
    }


}
