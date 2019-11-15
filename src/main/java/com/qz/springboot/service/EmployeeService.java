package com.qz.springboot.service;

import com.qz.springboot.entity.Employee;
import com.qz.springboot.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    protected EmployeeMapper employeeMapper;

    public void save(Employee employee) {
        employeeMapper.insert(employee);
    }

    public int updateEmployee(Employee employee) {
        int count = employeeMapper.updateByPrimaryKeySelective(employee);
        return count;
    }
}
