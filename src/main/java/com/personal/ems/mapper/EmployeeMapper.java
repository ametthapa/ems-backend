package com.personal.ems.mapper;

import com.personal.ems.dto.EmployeeDto;
import com.personal.ems.entity.Employee;

public class EmployeeMapper {
    public static EmployeeDto mapToEmployeeDto(Employee employee){
        return new EmployeeDto(employee.getId(), employee.getFirstName(), employee.getLastName(), employee.getEmail());
    }
    public static Employee mapToEmployee(EmployeeDto employee){
        return new Employee(employee.getId(), employee.getFirstName(), employee.getLastName(), employee.getEmail());
    }
}
