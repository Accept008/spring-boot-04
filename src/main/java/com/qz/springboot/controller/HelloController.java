package com.qz.springboot.controller;

import com.alibaba.fastjson.JSON;
import com.qz.springboot.entity.Classes;
import com.qz.springboot.entity.Employee;
import com.qz.springboot.service.ClassService;
import com.qz.springboot.service.EmployeeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api("用户管理类")
public class HelloController {
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private ClassService classService;

   /* @RequestMapping("hello")
    public String hello(){
        return "Test::swagger-lombok";
    }*/

    @PostMapping(value = "employee")
    @ApiOperation(value = "新增一个用户",notes = "新增之后返回对象")
    //@ApiImplicitParam(paramType = "query",name = "employee",value = "用户",required = true)
    @ApiResponse(code = 400,message = "参数没有填好",response = String.class)
    public String insert(Employee employee){
        System.out.println("employee::"+ JSON.toJSONString(employee));
        if(employee != null) {
            employeeService.save(employee);
            return "success";
        }else {
            return "error";
        }
    }

    /**
     * 修改单个成员
     * @param employee
     * @return
     */
    @PutMapping(value = "employee/{id}")
    @ApiOperation(value = "修改用户信息",notes = "根据成员id修改单个用户")
    @ApiImplicitParam(paramType = "path",name = "id",value = "用户id",required = true,dataType = "Integer")
    public String update(Employee employee){
        System.out.println("请求::");
        int flag = employeeService.updateEmployee(employee);
        if (flag != 0) {
            return "success";
        }else {
            return "error";
        }
    }

    @PostMapping(value = "class")
    @ApiOperation(value = "新增一个班级",notes = "新增之后返回对象")
    //@ApiImplicitParam(paramType = "query",name = "employee",value = "用户",required = true)
    @ApiResponse(code = 400,message = "参数没有填好",response = String.class)
    public String insert(Classes classes){
        System.out.println("class::"+ JSON.toJSONString(classes));
        if(classes != null) {
            classService.save(classes);
            return "success";
        }else {
            return "error";
        }
    }
}
