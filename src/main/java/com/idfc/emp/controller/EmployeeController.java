package com.idfc.emp.controller;

import com.idfc.emp.pojo.Employee;
import com.idfc.emp.repository.EmployeeRepository;
import com.idfc.emp.service.EmployeeService;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpResponseWrapper;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import jakarta.inject.Inject;

@Controller("/emp")
public class EmployeeController {
    @Inject
    EmployeeService employeeService;

    @Post
    public HttpResponse add(@Body Employee employee) {
        return HttpResponse.created(employeeService.save(employee));
    }

    @Get
    public HttpResponse findAll() {
        return HttpResponse.ok(employeeService.findAll());
    }

}
