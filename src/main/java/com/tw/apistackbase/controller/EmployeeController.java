package com.tw.apistackbase.controller;

import com.google.gson.Gson;
import com.tw.apistackbase.model.Employee;
import com.tw.apistackbase.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private final Logger log = Logger.getLogger(this.getClass().getName());
    private EmployeeService employeeService;

    @Autowired
    public EmployeeController() {
        employeeService = new EmployeeService();
    }

    @GetMapping(produces = {"application/json"})
    public List<Employee> getAll() {
        List<Employee> employees=employeeService.getAll();
        return employees;
    }

    @PostMapping(produces = {"application/json"})
    public ResponseEntity<Employee> add(@RequestBody Employee employee) {
        employeeService.addEmployee(employee);
        return ResponseEntity.ok(employee);
    }

}
