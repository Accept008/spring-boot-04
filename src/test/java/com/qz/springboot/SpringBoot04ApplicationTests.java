package com.qz.springboot;

import com.alibaba.fastjson.JSON;
import com.qz.springboot.entity.Employee;
import com.qz.springboot.mapper.EmployeeMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBoot04ApplicationTests {
    @Autowired
    private EmployeeMapper employeeMapper;

    @Test
    void contextLoads() {
        Employee employee = JSON.parseObject("{\"age\":1,\"employeeId\":1,\"graId\":2,\"userName\":\"cjc\"}", Employee.class);
        int flag = employeeMapper.insert(employee);
        System.out.println("flag::" + flag);
    }

    @Test
    void test(){
        Employee employee = JSON.parseObject("{\"age\":1,\"employeeId\":1,\"graId\":2,\"userName\":\"cjc\"}", Employee.class);
        System.out.println("employee::"+JSON.toJSONString(employee));
        employee.setUserName("Set::CJC");
        employee.setUserName("Set::Employee::"+JSON.toJSONString(employee));
    }
}
