package com.tw.apistackbase.service;

import com.tw.apistackbase.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class EmployeeService {

    private List<Employee> employees;

    public EmployeeService() {
        this.employees = new ArrayList<>();
//        addEmployee(new Employee( "小明", 20, "男"));
//        addEmployee(new Employee( "小紅", 19, "女"));
//        addEmployee(new Employee( "小智", 15, "男"));
//        addEmployee(new Employee( "小剛", 16, "男"));
//        addEmployee(new Employee( "小霞", 15, "女"));
    }

    public List<Employee> getAll() {
        return this.employees;
    }

    public void addEmployee(Employee employee) {
        this.employees.add(employee);
    }

}
