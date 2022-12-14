package com.idfc.emp.repository;

import com.idfc.emp.pojo.Employee;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.jpa.repository.JpaRepository;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
