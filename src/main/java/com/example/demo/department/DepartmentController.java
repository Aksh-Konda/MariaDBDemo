package com.example.demo.department;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;
    
    @RequestMapping("/departments")
    public ResponseEntity<List<Department>> getAllEmployees() {
        List<Department> departments = departmentService.getAllDepartments();
        return new ResponseEntity<>(departments, HttpStatus.OK);
    }
    @PostMapping("/department")
    public ResponseEntity<Department> saveEmployee(@RequestBody Department department) {
        Department dep = departmentService.addDepartment(department);
        return new ResponseEntity<>(dep, HttpStatus.OK);
    }
    @PutMapping("/department")
    public ResponseEntity<Department> updateEmployee(@RequestBody Department department) {
        Department dep = departmentService.addDepartment(department);
        return new ResponseEntity<>(dep, HttpStatus.OK);
    }
    @DeleteMapping("/department")
    public ResponseEntity<String> deleteEmployee(@RequestParam(name = "departmentId") Integer depId) {
        departmentService.deleteDepartment(depId);
        return new ResponseEntity<>("Deparment with ID :" + depId + " deleted successfully", HttpStatus.OK);
    }
}
