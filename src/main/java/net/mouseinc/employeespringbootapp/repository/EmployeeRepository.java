package net.mouseinc.employeespringbootapp.repository;

import net.mouseinc.employeespringbootapp.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}