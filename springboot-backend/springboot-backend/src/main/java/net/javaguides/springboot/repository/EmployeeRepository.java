package net.javaguides.springboot.repository;

import net.javaguides.springboot.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    // All the CRUD database methods present in JpaRepository will be inherited to EmployeeRepository, So we can make use of it.
}
