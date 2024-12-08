package tech.getarryas.employeemanager.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.getarryas.employeemanager.model.Employee;

import java.util.Optional;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
    Optional<Employee> findEmployeeById(Long id); // Query Method

}
