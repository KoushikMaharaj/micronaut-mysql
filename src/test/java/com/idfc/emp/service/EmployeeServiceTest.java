package com.idfc.emp.service;

import com.idfc.emp.pojo.Employee;
import com.idfc.emp.repository.EmployeeRepository;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@MicronautTest
@Disabled
class EmployeeServiceTest {

    @InjectMocks
    EmployeeRepository repository;


    @Inject
    EmployeeService service;


    @Test
    @Disabled
    void save() {

    }

    @Test
    void findAll() {
        List<Employee> employees = Arrays.asList(new Employee[]{new Employee(1, "Koushik")
                , new Employee(2, "Koushik")});
        System.out.println(repository);
        when(repository.findAll()).thenReturn(employees);
        assertEquals(employees, service.findAll());

    }


}