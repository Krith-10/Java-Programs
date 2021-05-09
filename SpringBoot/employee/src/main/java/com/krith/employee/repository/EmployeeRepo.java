package com.krith.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.krith.employee.domain.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long> {

}
