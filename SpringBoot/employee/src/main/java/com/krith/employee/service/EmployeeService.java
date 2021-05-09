package com.krith.employee.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.krith.employee.domain.Employee;
import com.krith.employee.repository.EmployeeRepo;


@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepo repo;
	
	public List<Employee> listAll() {
		return repo.findAll();
	}
	
	public void save(Employee e) {
		repo.save(e);
	}
	
	public Optional<Employee> get(long id) {
		return repo.findById(id);
	}
	
	public void delete(long id) {
		repo.deleteById(id);
	}
}
