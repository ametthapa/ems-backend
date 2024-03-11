package com.personal.ems.repository;

import com.personal.ems.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;

public interface EmployeeRepository extends JpaRepository<Employee, Long  > {
}
