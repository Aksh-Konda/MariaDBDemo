package com.example.demo.department;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {
	@Autowired
	private DepartmentRepository departmentRepository;
	
	public List<Department> getAllDepartments() {
		return departmentRepository.findAll();
	}
    public Department addDepartment(Department department) {
        return departmentRepository.save(department);
    }
    public Department editDepartment(Department entity) {
        return departmentRepository.save(entity);
    }
    public void deleteDepartment(Integer id) {
        departmentRepository.deleteById(id);
    }
}