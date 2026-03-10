package vn.edu.hust.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.edu.hust.employee.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
