package com.qz.springboot.mapper;

import com.qz.springboot.entity.Employee;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;
@Repository
public interface EmployeeMapper extends Mapper<Employee> {
}