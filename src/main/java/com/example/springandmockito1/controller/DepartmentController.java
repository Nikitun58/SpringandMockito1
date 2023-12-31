package com.example.springandmockito1.controller;
import com.example.springandmockito1.model.Employee;
import com.example.springandmockito1.service.DepartmentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Map;
@RestController
@RequestMapping("/departments")
public class DepartmentController {
    private final DepartmentService departmentService;
    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @GetMapping("/max-salary")
    public double detEmployeeMaxSalary(@RequestParam("departmentID") int department) {
        return departmentService.detEmployeeMaxSalary(department);
    }

    @GetMapping("/min-salary")
    public double detEmployeeMinSalary(@RequestParam("departmentID") int department) {
        return departmentService.detEmployeeMinSalary(department);
    }

    @GetMapping("/sum")
    public double getEmployeeSalarySum(@RequestParam("departmentID") int department) {
        return departmentService.detEmployeeSalarySum(department);
    }

    @GetMapping("/all")
    private Map<Integer, List<Employee>> getAll() {
        return departmentService.getAll();
    }


    }
