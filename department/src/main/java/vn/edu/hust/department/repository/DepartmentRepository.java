package vn.edu.hust.department.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.edu.hust.department.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

    Department findByDepartmentCode(String departmentCode);
}
