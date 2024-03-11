package com.personal.ems.service;

import com.personal.ems.dto.EmployeeDto;

import java.util.List;

public interface EmployeeService {
    EmployeeDto create(EmployeeDto employeeDto);
    EmployeeDto getById(Long employeeId);
    List<EmployeeDto> getAll();
    EmployeeDto update(Long employeeId, EmployeeDto updatedEmployee);

    void delete(Long employeeId);

}
